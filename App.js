import React from 'react';
import {SafeAreaView, Button, View, StyleSheet} from 'react-native';
import Counter from './components/Counter';
const App = () => {
  return (
    <SafeAreaView style={styles.block}>
      <Counter />
    </SafeAreaView>
  );
};
const styles = StyleSheet.create({
  block: {
    flex: 1,
  },
});
/*
const styles = StyleSheet.create({
  block: {
    backgroundColor: 'blue',
    flex: 1,
    justifyContent: 'center',
  },
  buttons: {
    flexDirection: 'row',
    justifyContent: 'center',
  },
  button: {
    width: 80,
    height: 45,
  },
});
*/

export default App;
