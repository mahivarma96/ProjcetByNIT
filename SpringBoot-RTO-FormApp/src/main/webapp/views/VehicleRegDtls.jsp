<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<head>
<meta charset="ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.12.4.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.min.js"></script>
<script>
$(function(){
	$('form[id="VehicleRegDtls"]').validate({
		rules: {
			RegDate:'required',
			RegCenter:'required',
			CreateDate:'required',
			UpdateDate:'required',
			VehicleRegNum:'required'
		},
		messages: {
		
			RegDate:'enter registration date',
			RegCenter:'enter registration center name',
			CreateDate:'entr valid creation date',
			UpdateDate:'enter the udated date',
			Vehicle_Reg_Num:'enter vehicle reg num'
			
		},
		submitHandler:function(form) {
			form.submit();
		}
	});
	
});
</script>
</head>
<body>
 <h2>Vehicle Registration Details</h2>
 <form:form action="/vhcldtlsreg" modelAttribute="vhclreg" method="post" id="VehicleRegDtls">
 <table>
 	
 	<tr>
 		<td>Reg_Date</td>
 		<td><form:input path="RegDate" /> </td>
 	</tr>
 	<tr>
 		<td>Reg_Center</td>
 		<td><form:input path="RegCenter" /></td>
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
 	<td>Vehicle_Reg_Num</td>
 	<td><form:input type="text" path="VehicleRegNum" /> </td>
 	</tr>
    <tr>
    <td><input type="submit" value="next" /></td>
    </tr>
 </table>
 
 </form:form>
</body>
</html>