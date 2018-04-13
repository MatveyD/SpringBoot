<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<table>
    <tbody>
    <tr><th>ID</th><th>Name</th></tr>
    <c:forEach items="${users}" var="user">
        <tr><td>${user.id}</td>
            <td>${user.login}</td>
    </c:forEach>
    </tbody>
</table>

</body>