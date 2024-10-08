import { useState, useReducer, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';
import { DiStackoverflow } from 'react-icons/di';


const intialvalue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

function reducer(items, action) {
    

  switch(action.type){
    case 'ADD':

    return items. concat(action.todo);
         
    case 'TOGGLE' :
        return items.map(item => item.id === action.id ? {...item, done: !item.done}
        : item,);
        case 'REMOVE' :
            return items.filter((item) => item.id !== action.id);
  }
    return items;
}

const TodoContainer = () => {

     const [items, dispatch] = useReducer(reducer, intialvalue);

 
  const [todo, setTodo] = useState('');
   const[message, setMessage] = useState('');
   
  let id = useRef(4); // 할일 id

  // 할일 등록 처리
  const onsubmit = (e) => {
    e.preventDefault();

    if (!todo.trim()) {
          setMessage('할일을 입력하세요.');
        return;

    }

    dispatch({type: 'ADD', 
    todo : {
        id: id.current,
        title: todo,
        done: false,
    },
   });

    id.current++;

    setTodo('');
    setMessage('');

  };

  //할일 입력시  todo  상태값 변경
  const onChange = (e) => setTodo(e.currentTarget.value);


  // 할일 목록 완료 여부 토글 (true -> false, false -> true)
  const onToggle = ((id) => {
        dispatch({ type: 'TOGGLE', id});
  },[]);

  //할일 목록 제거
  const onRemove = ((id) => {
   dispatch({type: 'REMOVE', id});
  },[]);

  return (
    <>
      <AddTodo onSubmit={onsubmit} onChange={onChange} todo={todo} message={message} />
      <TodoList items={items} onToggle={onToggle}  onRemove={onRemove}/>
    </>
  );
};

export default TodoContainer;
