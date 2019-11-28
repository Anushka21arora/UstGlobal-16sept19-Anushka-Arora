/*  const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name: 'BillGate',
            age: 67
        },{
            name: 'Mark Zuckerberg',
            age : 40
        },{
            name: 'Jeff Bezos',
            age:45
        }]);

    }
    else{
        reject('Failed');
    }
})
message.then(function(msg){
     console.log('Employee Data',msg);
}).catch(function(error){
console.log('Failure Message',error);
}) */
const message = new Promise(function(resolve,reject){
    if(5>10){
        resolve('success');

    }
    else{
        reject('Failed');
    }
})
message.then(function(msg){
     console.log('Success Message',msg);
}).catch(function(error){
console.log('Failure Message',error);
})
/* const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name: 'Anushka',
            age: 22
        },{
            name: 'Reshu',
            age : 22
        },{
            name: 'Soumen',
            age:22
        }]);

    }
    else{
        reject('Failed');
    }
})
message.then(function(msg){
     console.log('frnds Data',msg);
}).catch(function(error){
console.log('Failure Message',error);
}) */
//closure

function outerFunction(counter){
    function innerFunction(){
    let count;
    count = counter +10;
    return count;
    }
    return innerFunction;
}
let innerFunc = outerFunction(20);
let counter = innerFunc();
console.log('counter value',counter);