<#import "spring.ftl" as spring>


<!DOCTYPE html>

<html lang='en'>
<head>
    <meta charset="UTF-8" /> 
    <title>
        Employee
    </title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>" />
 </head>
<body>

<div id="wrapper">

	<div name="login-form" class="login-form">
	
		<div class="header">
		<h1>Employee</h1>
		<span>Information of employee</span>
		</div>
		<span>
		
		firstname: <h1>${emp.firstname} </h1>
	lastname:  <h1>${emp.lastname}</h1>
	salary: <h1>${emp.salary} $</h1>
		</span>
		</div>

		
	
	</div>

</div>
<div class="gradient"></div>


</body>
</html>
