<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employee List</h1>
    
    <button onclick="window.location.href='${pageContext.request.contextPath}/user/addEmployeeForm'">Add Employee</button>
    
    <br>
    <br>
    
	<div>
		<table border="1" style="width: 50%">
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
			</tr>

			<c:forEach items="${users}" var="usr">
			
				<c:url var="deleteUrl" value="/deleteUser">
				    <c:param name="employeeId" value="${usr.id}" />
				</c:url>
				
				<c:url var="updateUrl" value="/updateUser">
				    <c:param name="employeeId" value="${usr.id}" />
				</c:url>
				
				<tr>
					<td>${usr.id}</td>
					<td>${usr.firstName}</td>
					<td>${usr.lastName}</td>
					<td>
						<a href="${deleteUrl}" onClick="if(!(confirm('Are you sure?'))) return false;">Delete</a> | 
						<a href="${updateUrl}">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>