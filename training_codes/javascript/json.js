const person = {
               name:'Sundara',
               age: 100,
               address: {
                    city:'bijapur',
                    state:'karnataka',
                    pincode : 591115
               },
               hobbies :['coding','bird watching','singing']
} 
console.log('javaScript person object',person);
const jsonObject = JSON.stringify(person);
console.log('json person object',jsonObject);
const javaScriptPersonObject = JSON.parse(jsonObject);
console.log('javaScript person object after parse',javaScriptPersonObject);

localStorage.setItem('email','billgate@gmail.com');
const emailId = localStorage.getItem('email');
console.log('Email Id',emailId);
localStorage.clear();