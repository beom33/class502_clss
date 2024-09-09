import React from 'react';
import {View, Text, Button} from 'react-native';

const Greeting = ({name}) => {
  return (
    <>
      <View>
        <Text>풋볼클럽, {name ?? 'chelsea'} </Text>
      </View>
      <Button title="확인" />
    </>
  );
};
/*
Greeting.defaultProps = {
  name: '기본 이름',
}; */

export default Greeting;
