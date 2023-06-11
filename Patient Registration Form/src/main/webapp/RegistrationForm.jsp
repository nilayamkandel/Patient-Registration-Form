<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Registration</title>
</head>
<body>
	<h2>Patient Registration form</h2>
	Name   <input type ="text" name ="fname" placeholder ="First name">
		   <input type ="text" name ="lname" placeholder ="Last name"><br>
	
	<p>  Gender <input type = "radio" id="female">
		   <label for="female">F</label>
		   <input type = "radio" id="male">
		   <label for="male">M</label><br></p>
		   
	<p>Phone  <input type ="tel" name ="phone" ><br></p>
	
	<p>DOB    <input type ="date" id="dob"><br></p>
	 
	<p>Marital Status <input type = "radio" id="married">
		   <label for="married">M</label>
		   <input type = "radio" id="unmarried">
		   <label for="unmarried">U</label><br></p>
	
	<p>Present Address   <input type ="text" name ="Paddress" ><br>	</p> 
	 
	Communication Address   <input type ="text" name ="Caddress" >
	
	<p>Past Medical History</p>	
	<input type="checkbox" name="anemia" >
	<label for="anemia"> Anemia</label>
	<input type="checkbox" name="asthma" >
	<label for="asthma"> Asthma</label>
	<input type="checkbox" name="diabetes" >
	<label for="diabetes"> Diabetes</label><br>
	<input type ="checkbox" name="cancer">
	<label for="cancer">Cancer</label>
	&nbsp;
	<input type ="checkbox" name="ulcer">
	<label for="ulcer">Ulcer</label>
	&nbsp;&nbsp;
	<input type ="checkbox" name="chickenpox">
	<label for="chickenpox">Chickenpox</label><br>
	<input type ="checkbox" name="other">
	<label for="other">Other</label>
	<input type="text" name="other"><br>
	
	<p>Other Details   <input type ="text" name ="details" ></p>   
		
		
</body>
</html>