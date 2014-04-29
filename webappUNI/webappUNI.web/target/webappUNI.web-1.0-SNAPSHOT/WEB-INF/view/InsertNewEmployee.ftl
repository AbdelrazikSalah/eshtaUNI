<#import "spring.ftl" as spring>


<!DOCTYPE html>

<html lang='en'>
<head>
    <meta charset="UTF-8" /> 
    <title>
        Insert New Employee
    </title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
 	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>">
 	 <script type="text/javascript" src = "http://yui.yahooapis.com/3.16.0/build/yui/yui-min.js";"></script> 
 	<script type="text/javascript" src="<@spring.url '/js/yui.js'/>"></script>
 </head>	
<body>

<div id="wrapper" class="login-form">

	<div id="login-form" name="login-form" class="login-form" >
	
		<div class="header">
		<h1> Employee Form</h1>
		<span>Fill out the form below to insert new employee</span>
		</div>
	
		<div class="content">
		<input id="firstname" name="firstname" type="text" class="input username" placeholder="firstname" value="" />
	
		<div class="content">
		<input id="lastname" name="lastname" type="text" class="input username" placeholder="lastname" value="" />
		
		<div class="content">
		<input id="salary" name="salary" type="text" class="input username" placeholder="salary" value="" />

		
		</div>

		<div class="footer">
	
		<button onclick="sendForm()" class="button">submit</button>
		
		<a href="http://localhost:8097/ES">To search for an employee</a> 
		
		
		</div>
		
		</div>
		
		
		
		
	
	</div>
	
		

</div>



<div class="gradient"></div>


</body>
</html>
