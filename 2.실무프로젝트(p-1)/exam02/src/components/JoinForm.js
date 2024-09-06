import { useState, useEffect, useRef } from "react";

const JoinForm = () => {
    const [form,setForm] = useState({});

    let userIDEl = useRef();

    useEffect(() => {
       // userIDEl.focus();
        //console.log(userIDEl.current);
        userIDEl.current.focus();

    }, [userIDEl]);
    
    const onChange = (e) => {
    //setForm ({...form, [e.currentTarget.name]: e.currentTarget.value});
    const name = e.currentTarget.name;
    const value = e.currentTarget.value; 
    
    setForm((prevForm) => ({...prevForm,[name]: value}));


    };

    const onSubmit = (e) => {
        e.preventDefault();
        // 처리완료


        //양식 값을 비워두기

        setForm({});



};



             
      return (
        <form onSubmit={onsubmit}>
            <dl>
                <dt>아이디</dt>
                <dd>
                    <input type="text" name="userID" onChange={onChange} value={form.userId ?? ''} //ref={(ref) => (userIDEl = ref)}
                     ref={userIDEl}
                    />
                </dd>
            </dl>
            <dl>
                <dt>비밀번호</dt>
                <dd>
                    <input type="password" name="userPw"onChange={onChange} value={form.userPw ?? ''}/>
                </dd>
            </dl>
            <dl>
                <dt>비밀번호 확인</dt>
                <dd>
                    <input type="password" name= "confirmPw" onChange={onChange} value={form.confirmpw ?? ''}/>
                </dd>
            </dl>
            <dl>
                <dt>회원명</dt>
                <dd>
                    <input type="text" name="userNm" onChange={onChange} value={form.userNm ?? ''}/>
                </dd>
            </dl>
            <button type="submit">가입하기</button>
        </form>

    );
};

export default JoinForm;
