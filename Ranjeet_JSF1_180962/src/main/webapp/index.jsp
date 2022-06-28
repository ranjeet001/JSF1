<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
body{background-color:LightGray;}
h2{text-align: center;}
table{border:1px solid;}
table.center{
	  margin-left:auto; 
	  margin-right: auto;
	}
table tr td{
	 padding:10px;
	}
</style>
</head>
<body>
	<h2>Form Validation</h2>
	

	<table class="center">
		<form   name="myform" action="./UserData" method="post" onsubmit="return validateform()">
			<tr>
				<td>
					<label for="name">
						Name
					</label>
				</td>
				<td><input type="text" name="name" id="name" />
				</td>
			</tr>
			<tr>
				<td>
					<label for="name">
						UserName
					</label>
				</td>
				<td><input type="text" name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td>
					<label for="name">
						Password
					</label>
				</td>
				<td><input type="password" name="password" id="password" />
				</td>
			</tr>
			<tr>
				<td>
					<label for="name">
						Re-type Password
					</label>
				</td>
				<td><input type="password" name="password2" id="password2" />
				</td>
			</tr>
			<tr>
				<td>
					<label for="name">
						Gender
					</label>
				</td>
				<td><span><input name="gender" type="radio" value="Male">Male</span>
	 					<span><input name="gender"  type="radio" value="Female">female</span>
	 					<span><input  name="gender" type="radio" value="Others">Others</span>
				</td>
			</tr>
			<tr>
				<td><label for="email">
						Programming Skills
					</label>
				</td>
				<td><span><input name="skills" type="checkbox" value="Java">Java</span>
					 <span><input name="skills2"  type="checkbox" value="Android">Android</span>
					 <span><input  name="skills3" type="checkbox" value="Ruby">Ruby</span>
					 <span><input name="skills4"  type="checkbox" value=".net">.Net</span>
				</td>
			</tr>
			<tr>
				<td><label for="email">
						Contact No
					</label>
				</td>
				<td><input name="contact" id="contact" type="text" />
				</td>
			</tr>
			<tr>
				<td><label for="email">
						Email Address
					</label>
				</td>
				<td><input type="email" name="email" id="email" />
				</td>
			</tr>
				<td>
					<label for="name">
						College
					</label>
				</td>
				<td>
					  <select name="college" id="college">
					  <option value="">----Select College---</option>
					    <option value="G L Bajaj College">G L Bajaj College</option>
					    <option value="IIMT College">IIMT College</option>
					    <option value="Sharda University">Sharda University</option>
					    <option value="Galgotiya Universit">Galgotiya University</option>
					  </select>
				</td>
			</tr>
			<tr>
				<td>
				</td>
				<td><input type="submit"/>
				</td>
			</tr>
			
		</form>
	</table>
	
 	<script>
 	function validateform(){  
 		var name=document.myform.name.value;  
 		var password=document.myform.password.value;  
 		var username=document.myform.username.value; 
 		var secondpassword=document.myform.password2.value;  
 		var contact=document.myform.contact.value;
 		var email=document.myform.email.value;
 		  
 		if (name==null || name==""){  
 		  alert("Name can't be blank");  
 		  return false;  
 		}else if (username==null || username==""){  
 	 		  alert("UserName can't be blank");  
 	 		  return false;  
 	 	}else if (email==null || email==""){  
 	 		  alert("Email Address can't be blank");  
 	 		  return false;  
 	 	}
 		else if (isNaN(contact)){  
 	 		  alert("Enter only number in contac field");  
 	 		  return false;  
 	 	}else if(password.length<6){  
 		  alert("Password must be at least 6 characters long.");  
 		  return false;  
 		}else if(password==secondpassword){  
 			 return true;  
 			 }else{  
 		 		alert("password must be same!");  
 		 		return false;  }  
 		}  
 	</script>
</body>
</html>
    