<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<jsp:include page="_menu.jsp"></jsp:include>

<form action="/create" method="POST">
    <input name="login" placeholder="Login" >
    <br>
    <input name="name" placeholder="Name" >

    <input type="submit" value="Create">
</form>

</body>