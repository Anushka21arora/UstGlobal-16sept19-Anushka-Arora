// Named Function

function add(num1,num2)
{
 console.log('sum=',num1+num2);
}
add(10,20);


//Function Expression

var sub = function(num1,num2)
{
 var subval = num1-num2;
 return subval;
}
var val = sub(20,10);
console.log('value =',val);


//self invoed Function


(function(num1,num2)
{
  console.log('val',num1+num2);
})(10,20);



//Fat Arrow Function
var div = (num1,num2)=> console.log('val',num1+num2);    
div(45,50);

var sub = (s1,s2)=> s1+s2;
sub(10,20);



//without calling call
gretting('anushka');
function gretting(msg)
{
    console.log('hello',msg)
}

greet('dinga');
var greet = function(msg)
{
     console.log('hello',msg);

}
greets('digi');
var greets=(msg)=>{
    console.log('hello',msg)
}
