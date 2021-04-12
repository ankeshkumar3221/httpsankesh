<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>SAVE PRODUCT</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-prouduct-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>List of product</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Product</h3>
	
		<form:form action="saveProuduct" modelAttribute="prouduct" method="POST">

			<!-- need to associate this data with prouduct id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>PROUDUCT:</label></td>
						<td><form:input path="prouduct" /></td>
					</tr>
				
					<tr>
						<td><label>BRAND:</label></td>
						<td><form:input path="brand" /></td>
					</tr>

					<tr>
						<td><label>PRICE:</label></td>
						<td><form:input path="price" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/prouduct/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>
