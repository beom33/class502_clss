import { Component } from 'react';

class LifeCycle extends Component {
  state = {
    number: 0,
  };
  constructor(props) {
    super(props);

    console.log('constructor');
  }
  static getDerivedStateFromProps(prevprops, prevstate) {
    console.log('getDerivedStateFromProps');
    if (prevprops.mode === 'even' && prevstate.number % 2 === 1) {
      return { number: prevstate.number + 1 };
    }
    return null;
  }

  shouldComponentUpdate(props, state) {
    //return state.number++ % 3 !== 0;

    return true;
    /*
    if(state.number % 3 === 0){
     
    return false;
   }

    return true;
    */
  }

  componentDidMount() {
    console.log('componentDidMount');
  }
  getSnapshotBeforeUpdate(props, state) {
    console.log('getDerivedStateBeforeUpdate');
    return { value: 100 };
  }
  componentDidUpdate(props, state, snapshot) {
    console.log('cocomponentDidUpdate');
    console.log('snapshot', snapshot);
  }

  componentWillUnmount() {
    console.log('componentwillUnmount');
  }

  render() {
    console.log('render');

    const { number } = this.state;
    try {
      number.abc();
    } catch (err) {
      console.log(err.message);
      console.error(err);
      console.log('에러 처리....');
    } finally{
        console.log('무조건 실행!');
    
    }
    //throw new Error('에러 발생!!!!!');

    
    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1 })}
        >
          +1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1 })}
        >
          -1
        </button>
      </>
    );
  }
}

export default LifeCycle;
