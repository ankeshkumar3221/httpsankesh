<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>SAVE PRODUCT</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>List of product </h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Prouduct -->
		
			<input type="button" value="Add Prouduct"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>PRODUCT</th>
					<th>BRAND</th>
					<th>PRICE</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our prouduct -->
				<c:forEach var="tempProuduct" items="${prouducts}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/prouduct/showFormForUpdate">
						<c:param name="prouductId" value="${tempProuduct.id}" />
					</c:url>					

					<!-- construct an "delete" link with Prouduct id -->
					<c:url var="deleteLink" value="/prouduct/delete">
						<c:param name="prouductId" value="${tempProuduct.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempProuduct.prouduct} </td>
						<td> ${tempProuduct.brand} </td>
						<td> ${tempProuduct.price} </td>
						
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this prouduct?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>