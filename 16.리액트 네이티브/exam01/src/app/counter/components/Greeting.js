import React from "react";

const Greeting = ({name, age, children }) => {
      age = age ?? 198;
   return ( 
   <div>
         <h1>{name}님, 환영합니다🫡</h1>
         <h2>Levle: {age} 달성🤨</h2>
         <div>{children(200)}</div>
         {/*<div>{children}</div>*/}
   </div> 
   );
};

export default Greeting;