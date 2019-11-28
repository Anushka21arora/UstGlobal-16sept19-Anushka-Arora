function showPassword(){
        var x = document.getElementById("pswd");
        if (x.type === "password") {
          x.type = "text";
        } else {
          x.type = "password";
        }
      
}
function check(){
  let userName = document.getElementById('uname').value;
  if(userName.length<5){
    document.getElementById('error').innerHTML="User name is invalid (Mininum 5 character required)";
    document.getElementById('error').style.color='red';
 }
 else{
    document.getElementById('error').innerHTML=" ";
 }


}     
function check1(){
    let password = document.getElementById('pswd').value;
    if(password.length<6){
      document.getElementById('error1').innerHTML="Password is invalid(Mininum length is 6)";
      document.getElementById('error1').style.color='red';
   }
   else{
      document.getElementById('error1').innerHTML=" ";
   }
  
  
  }     
 
  function button(){
    let uName = document.getElementById('uname').value;
    let pass = document.getElementById('pswd').value;
     let login   = document.getElementById('myBtn');
    if(uName.length>5 && pass.length>6){
     login.disabled = false;
    }
    
    else{
      login.disabled = true;
    }
  
  }