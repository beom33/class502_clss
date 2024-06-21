<%@ page contentType="text/html; charset=UTF-8" %>
<%

pageContext.setAttribute("num",10);

%>

${150 + 300}<br>
${num==20 ?  " 숫자 10입니다" : "숫자 10이 아닙니다"}