console.log('Window Object',window);
console.log('This Keyword',this);
console.log(this===window);
/* window.alert('Wlecome to Javascript');
alert('Welcome UST global and Test Yantra'); */
/* let confrimDelete = confirm('Are you sure you want to delete');
console.log('confrim delte',confrimDelete); */
/*  let username= prompt('what is your name');
 console.log(username); */
 const person = {
     firstname:'alia',
     lastname:'bhatt',
     age:26,
     getName : function(){
         console.log('this keyword',this);
    return this.firstname +' '+this.lastname
     }


 }
 let fullName = person.getName();
 console.log('full name',fullName);