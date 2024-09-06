import { Component } from 'react';

class color extends Component {
  state = {
    color: 'blue',
    subcolor: 'black',
  };

  render() {
    /* this -> color로 생성된 객체의 주소 
     function changecolor(color) {
        console.log(this);
    } */

    const changecolor = (color) => this.setState({ color }); //color
    const changesubcolor = (color) =>
      this.setState((prevstate) => ({ ...prevstate, subcolor: color }));

    const { color, subcolor } = this.state;
    return (
      <>
        <div
          style={{ background: color, width: '100px', height: '100px' }}
        ></div>

        <button
          type="button"
          onClick={() => changecolor('red')}
          onContextMenu={() => changesubcolor('red')}
        >
          RED
        </button>
        <button
          type="button"
          onClick={() => changecolor('gold')}
          onContextMenu={() => changesubcolor('gold')}
        >
          Gold
        </button>
        <button type="button" onClick={() => changecolor('green')}>
          GREEN
        </button>

        <div
          style={{ background: subcolor, width: '50px', height: '50px' }}
        ></div>
      </>
    );
  }
}

export default color;
