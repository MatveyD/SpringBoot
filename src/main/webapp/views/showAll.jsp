<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<jsp:include page="_menu.jsp"></jsp:include>

<table>
    <tbody>
    <tr><th>ID</th><th>Login</th><th>Name</th><th>Date</th></tr>
    <c:forEach items="${users}" var="user">
        <tr><td>${user.id}</td>
            <td>${user.login}</td>
            <td>${user.name}</td>
            <td>${user.dateofbirth}</td>
    </c:forEach>
    </tbody>
</table>

</body>