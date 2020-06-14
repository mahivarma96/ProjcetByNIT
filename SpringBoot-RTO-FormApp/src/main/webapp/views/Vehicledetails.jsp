<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.12.4.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.min.js"></script>
<script>
$(function(){
	$('form[id="VehicleDtlsForm"]').validate({
		rules:{
			type:'required',
			year:'required',
			vmodel:'required',
			CompanyName:'required',
			CreateDate:'required',
			UpdateDate:'required'
			
		},
		messages:{
			type:'enter user name',
			year:'enter firt name',
			vmodel:'enter the last name',
			CompanyName:'enter phno correctly',
			CreateDate:'entr valid creation date',
			UpdateDate:'enter the udated date'
			
			
		},
		submitHandler:function(form){
			form.submit();
		}
	});
});


</script>
</head>
<body>
<h2>enter vehicle details here</h2>


<form:form action="/next" method="post" modelAttribute="details" id="VehicleDtlsForm">

<table>
	<tr>
		<td>Type</td>
		<td><form:input path="type"/></td>
	</tr>
	<tr>
		<td>year</td>
		<td><form:input path="Mfgyear"/></td>
	</tr>
	<tr>
		<td>Vehicle model</td>
		<td><form:input path="vmodel"/></td>
		
	</tr>
	<tr>
		<td>Company Name</td>
		<td><form:input path="CompanyName"/></td>
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
	<td><input type="submit" value="previous"></td>
	<td><input type="submit" value="next"></td>
	</tr>
</table>


</form:form>

</body>
</html>