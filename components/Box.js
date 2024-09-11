import React from 'react';
import {View, StyleSheet} from 'react-native';

const Box = ({rounded, size}) => {
  return <View style={[styles.box, rounded && styles.rounded, styles[size]]} />;
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
   small : {
    width: 33,
    height: 32
   },
    medium: {
      width: 65,
      height: 65,
    },
    large: {
      width: 33,
      height: 33,
    }
});

export default Box;
