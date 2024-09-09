import React from 'react';
import {View, StyleSheet} from 'react-native';

const Box = ({rounded}) => {
  return <View style={[styles.box, rounded && styles.rounded]} />;
};

const styles = StyleSheet.create({
  box: {
    width: 64,
    height: 64,
    backgroundColor: 'black',
  },

  rounded: {
    borderRadius: 20,
  },
});

export default Box;
