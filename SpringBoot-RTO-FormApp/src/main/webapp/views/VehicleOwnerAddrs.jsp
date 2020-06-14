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
	$('form[id="VehicleOwnrAddrsForm"]').validate({
		rules:{
			HouseNo:'required',
			StreetName:'required',
			City:'required',
			Zipcode:'required',
			CreateDate:'required',
			UpdateDate:'required'
			
		},
		messages:{
			HouseNo:'enter user name',
			StreetName:'enter firt name',
			City:'enter the last name',
			Zipcode:'enter phno correctly',
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
<h1> enter vehicle owner dtls</h1>
<form:form action="/dtls" modelAttribute="adddtls" method="post" id="VehicleOwnrAddrsForm">
 <table>
 <tr>
 		<td>H:NO</td>
 		<td><form:input path="HouseNo"/> </td> 
 	</tr>
 	<tr>
 		<td>STREET NAME</td>
 		<td><form:input path="StreetName"/> </td>
 	</tr>
 	<tr>
 		<td>CITY</td>
 		<td><form:input path="City"/></td>
 	</tr>
 	
 	<tr>
 		<td>ZIP CODE</td>
 		<td><form:input path="Zipcode"/> </td>
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
    	<td><input type="submit" value="previous"/></td>
    	<td><input type="submit" value="next"/></td>
    </tr>
 </table>
 
 </form:form>
</body>
</html>