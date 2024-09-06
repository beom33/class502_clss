import { Component } from 'react';
import proptypes from 'prop-types';

class MyComponent extends Component {
  static defaultProps = {
    name: '기본이름',
  };

  static propTypes = {
    name: proptypes.string,
    num: proptypes.number.isRequired,
  };

  render() {
    const { name, num, children } = this.props;
    return (
      <>
        <div>안녕하세요!, 제 이름은 {name} 입니다.</div>
        <div>좋아하는 {num}는 입니다.</div>
        {children}
      </>
    );
  }
}

MyComponent.propTypes = {
  name: proptypes.string,
  num: proptypes.number.isRequired,
};

export default MyComponent;
