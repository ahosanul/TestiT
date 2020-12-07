<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>	Bangladesh Army University of Engineering & Technology(BAUET)</title>
 <link rel="stylesheet" href="style.css">

<style>
.desine{
    width: 300px;
    border: 25px solid green;
    padding: 25px;
    margin: 25px;
}

</style>
</head>
<body> 	
 <header>
		    <nav>
			    <h1>Bangladesh Army University of Engineering & Technology(BAUET)</h1>
			    <ul id="nav">
			        <li><a class ="HOMEblack"href="\Welcome_To_BAUET/profile.html">HOME</a></li>
			        <li><a class="HOMEblack" href="\Welcome_To_BAUET/StrudentReg.html">Registration</a></li>
			        <li><a class="HOMEred" href="\Welcome_To_BAUET/process_result.jsp">Process Result</a></li>
			        <li><a class="HOMEblack" href="\Welcome_To_BAUET/view.jsp">View Result</a></li>
			    
			    
			    </ul>
		    </nav>
	    </header>




<script type="text/javascript">

function firstSemester() {
	location.replace("table/firstTable.html");
}
function secondSemester() {
	location.replace("table/secondTable.html");
}
function thirdSemester() {
	location.replace("table/thirdTable.html");
}
function fourthSemester() {
	location.replace("table.html");
}
function fifthSemester() {
	location.replace("table.html");
}
function sixthSemester() {
	location.replace("table.html");
}
function seventhSemester() {
	location.replace("table.html");
}
function eightSemester() {
	location.replace("table.html");
}
</script>

<div class="desine">
<input type="button" value="first semester " onclick="firstSemester();"/><br>
<input type="button" value="second semester " onclick="secondSemester()"/><br>
<input type="button" value="third semester " onclick="thirdSemester()"/><br>
<input type="button" value="fourth semester " onclick="fourthSemester()"/><br>
<input type="button" value="fifth semester " onclick="fifthSemester()"/><br>
<input type="button" value="sixth semester " onclick="sixthSemester()"/><br>
<input type="button" value="seventh semester " onclick="seventhSemester()"/><br>
<input type="button" value="eight semester " onclick="eightSemester()"/><br>
</div>

</body>
</html>