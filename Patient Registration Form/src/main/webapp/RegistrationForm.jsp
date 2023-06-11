<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient</title>
</head>
<body>
	<h1>Patient</h1>
	
	
	<form action="RegistrationFormServlet" method="post">
	
    <label for="first_name">First Name</label>&nbsp;
    	<input type="text" id="first_name" name="fname" required><br><br>

    <label for="last_name">Last Name</label>&nbsp;
    	<input type="text" id="last_name" name="lname" required><br><br>

    <label for="email">Email</label>&nbsp;
    	<input type="email" id="email" name="email" required><br><br>

    <label for="phone">Phone</label>&nbsp;
    	<input type="tel" id="phone" name="phone" required><br><br>
    	
     <label for="marital">Marital Status</label>&nbsp;
		<input type="radio" id="marital" name="marital_status" value="married">Married	 
		<input type="radio" id="marital" name="marital_status" value="unmarried">Unmarried	   
		<br><br>

    <label for="date_of_birth">Date of Birth</label>&nbsp;
   	 <input type="date" id="date_of_birth" name="date_of_birth" required><br><br>

    <label for="gender">Gender</label>&nbsp;
	    <select id="gender" name="gender">
	      <option value="male">Male</option>
	      <option value="female">Female</option>
	      <option value="other">Other</option>
	    </select><br><br>

    <label for="address">Address</label>&nbsp;
    	<input id="address" name="address" required><br><br>    
    
   <label for="medical">Past Medical History<br>
	   
	    &nbsp;&nbsp;&nbsp;
	    <input type="checkbox" name="medical_history" id="medical"  value="anemia">Anemia 
	    	
	    <input type="checkbox" name="medical_history" id="medical" value="asthama"> Asthama 
	    	
	    <input type="checkbox" name="medical_history" id="medical" value="diabetes"> Diabetes 
	    <br>
	    
	   	&nbsp;&nbsp;&nbsp;	
	    <input type="checkbox" name="medical_history" id="medical" value="cancer"> Cancer 
	    
	    <input type="checkbox" name="medical_history" id="medical" value="ulcer"> Ulcer 
	    
	    <input type="checkbox" name="medical_history" id="medical" value="chickenpox"> Chickenpox 
	    	
	    <br>&nbsp;&nbsp;&nbsp;&nbsp;
	    Other &nbsp;<input id="medical" name="medical_history"><br><br>
	    
    </label>
    
    
   <label for="detail">   
   		Other Details <input id="detail" name="details" >
   	</label>
	<br><br>


    <input type="submit" value="Register">
  </form>	

	
</body>
</html>