

const App = () => {
       const name = 'js';

       const style = {
       backgroundcolor : "orange",
      color: 'white',
      height: '100px',
       };

  return (
    <>
    {/*주석...*/}
  <div class="subject"style={style}>
    첫번째 컴포넌트!! 
    </div>
  <div style={{color: 'blue'}}>신나는, {name&&name} 공부 </div>
  {name=== 'React'&&<h1>아! 재밌다</h1>}
  <input
  // 주석... 
        type="text"/> 
  </>
  );
};

export default App;