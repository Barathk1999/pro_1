<%@include file="CommonHeader.jsp"%>

<form action="login" method="post">
	<table align="center" cellspacing="1">
	<tr bgcolor="blue">
		<td colspan="2">
			<h4 style="color:white;"align="center">Sign In Here</p> 
		</td>
	</tr>
	<tr>
		<td>Login Name</td><td><input type="text" name="loginName" required/></td>
	</tr>
	<tr>
		<td>Password</td><td><input type="password" name="password" required/></td>
	</tr>	
	<tr bgcolor="blue">
	<td colspan="2" align="center">
		<input type="submit" value="Sign In"/>
		<input type="reset" value="RESET"/>
	</td>
	</tr>
	</form>

</body>
</html>