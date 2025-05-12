<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add New Employee</h1>
	
	<div>
			<form:form action="saveUser" modelAttribute="user" method="POST">
				
				First Name : <form:input path="firstName" placeholder="Full Name" /><br/>
				Last Name : <form:input path="lastName" placeholder="Email" /><br/>
				
				<input type="submit" value="Submit" />
				
			</form:form>
		</div>