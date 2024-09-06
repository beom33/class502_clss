import { useState,useCallback, useMemo} from "react";

function getAverage(nums) {
    // 합계 / 갯수 

    const total = nums.reduce((acc, num ) => {
         acc += num;

         return acc;
    }, 0);

    let avg = total / nums.length;
    avg = Math.round(avg * 10)/10; // 소수점 첫째 자리 까지 표기 (반올림)

    return avg;
}

const Average = () => {
    const [nums, setNums] = useState([]);
    const [num, setNum] = useState ('');

    const onChange = useCallback(
        (e) => 
        setNum(
           Number (e.currenTarget.value) !==NaN 
           ?Number(e.currenTarget.value)
            :0,
        ),
         [],
        );
     
    const onSubmit = useCallback (
        (e)=> {
          e.preventDefault();
          setNums((nums)=> nums.concat(num));
     }, 
     [num],
    );
    // const avg = getAverage(nums);
    const avg = useMemo (() => getAverage(nums), [nums]);// nums의 값이 변경 될때만 호출될필요, 다른x
    return (
      <>
      
        <form autoComplete="off" onSubmit={onSubmit}>
            <input type="number" value={num} onChange={onChange}/>
            <button type="submit">등록</button>
        </form>
        <ul>
            {nums.map((num, i) =>(<li key={i}>{num}</li> 
            
            ))}
        </ul>

        평균 : {avg}
      </>

    );


};

export default React.memo(Average);