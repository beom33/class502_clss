import React from "react";
import { useNavigate } from 'react-router-dom';

const NotFound = () => {
    const Navigate = useNavigate();

    return (
    <>
    <h1>페이지를 찾을수 없습니다.</h1>
    <button type= "button" onClick={() => Navigate(-1)}>
        이전페이지
        </button>
    <button type="button" onClick={() => Navigate ('/',{ replace: true})}>
        메인페이지
        </button>
    </>
    );
};

export default React.memo(NotFound);