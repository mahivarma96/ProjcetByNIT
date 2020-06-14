<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.12.4.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.min.js"></script>


<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <!-- //<script src="https://code.jquery.com/jquery-1.12.4.js"></script> -->
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
$(function(){
	$('form[id="VehicleRegForm"]').validate({
		rules: {
			FirstName:'required',
			LastName:'required',
			Email: {
				required:true,
				Email:true	
			},
			Phno:'required',
			DOB:'required',
			SSNO:'required',
			CreateDate:'required',
			UpdateDate:'required'
		
		},
		messages: {
		
			FirstName:'enter firt name',
			LastName:'enter the last name',
			Phno:'enter phno correctly',
			DOB:'enter the date in correect format',
			SSNO:'enter the correct ssno',
			CreateDate:'entr valid creation date',
			UpdateDate:'enter the udated date'
			
		},
		submitHandler:function(form) {
			form.submit();
		}
	});
	
});
$( function() {
    $( "#datepicker").datepicker();
  });


</script>
</head>
<body>
 <h2>Vehicle Registration</h2>
 <form:form action="/register" modelAttribute="reg" method="post" id="VehicleRegForm">
 <table>
 	<%-- <tr>
 		<td>User Name</td>
 		<td><form:input path="UserName" /> </td> 
 	</tr> --%>
 	<tr>
 		<td>Fisrt Name</td>
 		<td><form:input path="FirstName" /> </td>
 	</tr>
 	<tr>
 		<td>Last Name</td>
 		<td><form:input path="LastName" /></td>
 	</tr>
 	<tr>
 		<td>Email</td>
 		<td><form:input path="Email" /> </td>
 	</tr>
 	<tr>
 	<td>Phone Num</td>
 	<td><form:input path="Phno" /> </td>
 	</tr>
 	<tr>
 	<td>DOB</td>
 	<td><form:input type="text" path="DOB" id="datepicker"/> </td>
 	</tr>
 	<tr>
 	<td>SSNO</td>
 	<td><form:input path="SSNO" /> </td>
 	</tr>
 	<tr>
 		<td>Create_Dt</td>
 		<td><form:input path="CreateDate" /> </td>
 	</tr>
 	<tr>
 	<td>Update_Dt</td>
 	<td><form:input path="UpdateDate" /> </td>
 	</tr>
    <tr>
    <td><input type="submit" value="next" /></td>
    </tr>
 </table>
 
 </form:form>
</body>
</html>