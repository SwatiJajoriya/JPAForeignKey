
function validateform(){
	var email=document.f1.email.value;
	var pwd=document.f1.password.value;
	console.log(email+"  "+pwd)
	
	if(email==""|| pwd==""){
		alert("both fields must be filled ")
	}
	else{
		sendRequest(email,pwd);
	}
}

/*1. open the request 
2. set the headers 
3.make it to ready state
 4.validate the ready state status
  5. send the request */
function sendRequest(email,pwd){
	
	var xhr=new XMLHttpRequest();
	
	//request type,req name , enable req
	xhr.open("POST","/demo",true);
	
	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded")
	alert(email+"  "+pwd)
	xhr.onreadystatechange=function(){
		if(xhr.readyState==XMLHttpRequest.DONE && xhr.status==200){
			
		}
	};
	
	xhr.send("email="+email+"&password="+pwd);
	
}



