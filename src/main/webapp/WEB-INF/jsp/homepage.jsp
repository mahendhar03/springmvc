<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2 align="center">Eat Hot</h2>
	<br />
	
	<h3 align="center">search orders</h3><br/>
	<form action="${pageContext.request.contextPath}/order.mvc" method="post">
		<span>OrderId : </span><input type="text" name="orderId"/><br/>
		<span>Item : </span><input type="text" name="item"/><br/>
		<span>Quantity : </span><input type="text" name="quantity"/><br/>
		<button type="submit">search</button>
	</form>	
	
</body>
</html>