// function first(callback){
//     setTimeout( function(){
//         console.log('First Function Executed');
//         callback();
//     },5000)
   
    

// }
// function second(){
//      console.log('second Function Executed');
// }
// first(second);

function first(){
    setTimeout( function(){
        console.log('First Function Executed');
        
    },5000)
   
    

}
function second(){
     console.log('second Function Executed');
}
first();
second();
