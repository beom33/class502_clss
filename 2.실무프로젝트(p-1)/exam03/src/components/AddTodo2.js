import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';


const AddTodo = ({ onSubmit, onChange, todo, message }) => {
 useEffect(()=> { // componentDidMount (), componentDidUpdate() - todo값의 변화에 의한 렌더링렌더링
         console.log("todo, message 값 변경- 렌더링 후");

return () => {
  console.log('뒷정리 함수.../ update');
}

 }, [todo, message]); // [...]// 변화 감지 기준 

  useEffect(() => {
    console.log("마운트시 한번만 호출"); // componentDidMount()
    //DOMContentLoaded 비슷 (동일 x)
  }, []);

 
useEffect(() => { // componentDidMount(), componentDidUpdate(), 
      console.log("message 값 변경"); 
}, [message]);

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>

        { message && <div>{message}</div>}
    </form>
  );
}; 
export default AddTodo;
