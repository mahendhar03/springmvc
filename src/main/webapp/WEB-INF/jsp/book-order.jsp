<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2 align="center">Place Orders</h2>
	<br />
	<table>
		<form:form commandName="order">
			<%-- <span style="color: red;"><form:errors path="*" /></span> --%>
			<tr>
				<td>customerId :</td>
				<td><form:input path="customerId" /></td>
				<td><span style="color: red;"><form:errors
							path="customerId" /></span></td>
			</tr>
			<tr>
				<td>customerType :</td>
				<td><form:input path="customerType" /></td>
				<td><span style="color: red;"><form:errors
							path="customerType" /></span></td>
			</tr>
			<tr>
				<td>storeName :</td>
				<td><form:input path="storeName" /></td>
				<td><span style="color: red;"><form:errors
						path="storeName" /></span></td>
			</tr>
			<tr>
				<td>itemName</td>
				<td><form:input path="itemName" /></td>
				<td><span style="color: red;"><form:errors
						path="itemName" /></span></td>
			</tr>
			<tr>
				<td>orderedQuantity</td>
				<td><form:input path="orderedQuantity" /></td>
				<td><span style="color: red;"><form:errors
						path="orderedQuantity" /></span></td>
			</tr>
			<tr>
				<td>quantityType</td>
				<td><form:input path="quantityType" /></td>
				<td><span style="color: red;"><form:errors
						path="quantityType" /></span></td>
			</tr>
			<tr><td colspan="3"><input type="submit" value="submit" /><td></tr>
			</form:form>
		</table>
	</body>
</html>