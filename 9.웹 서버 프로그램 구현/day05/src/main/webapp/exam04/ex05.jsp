<%@ page contentType="text/html; charset=UTF-8" %>
User-Agent : ${header}['user-Agent']}<br>

JESSIONID : ${cookie.JESSIONID.getValue()}<br>
JESSIONID : ${cookie.JESSIONID .Value}<br>
key1 : ${initParam.key1}<br>

URI : ${pageContext.getRequest().getRequestURI()}<br>
URI : ${pageContext.request.requestURI}<br>
