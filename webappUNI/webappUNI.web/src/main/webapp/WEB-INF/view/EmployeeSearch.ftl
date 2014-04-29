<#import "spring.ftl" as spring>


<!DOCTYPE html>

<html lang='en'>
<head>
    <meta charset="UTF-8" /> 
    <title>
        Search Employee
    </title>
	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>" />
</head>
<body>

<div id="wrapper">

	<form name="login-form" class="login-form" action="http://localhost:8097/getid" method="get">
	
		<div class="header">
		<h1>Search Form</h1>
		<span>Fill out the form below to search for an employee</span>
		</div>
	
		<div class="content">
		<input name="id" type="text" class="input username" placeholder="ID" />
		<div class="user-icon"></div>
		
		</div>

		<div class="footer">
		<input type="submit" name="submit" value="submit" class="button" />
		</div>
	
	</form>

</div>
<div class="gradient"></div>


</body>
</html>
