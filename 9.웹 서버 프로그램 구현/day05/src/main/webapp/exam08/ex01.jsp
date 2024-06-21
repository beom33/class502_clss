<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<c:set var="str" value="첼시,리버풀,맨시티,뮌헨,발렌시아" />
<c:set var="soccerTeam" value="${fn:split(str,',')}" />
str : ${str}<br>
soccerTeam : ${soccerTeam}<br>

<c:forEach var="soccerTeam" items="${soccerTeam}">
${soccerTeam}<br>
</c:forEach>

str2 : ${fn:join(soccerTeam,"s")}<br>