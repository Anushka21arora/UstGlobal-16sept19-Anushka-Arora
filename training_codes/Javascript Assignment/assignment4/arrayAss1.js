const items = [
    {
        name : 'Earing',
        id :1 ,
        price : 5000
    },
    {
        name : 'Kajal',
        id :2 ,
        price : 100
    },
    {
        name : 'Trimmer',
        id :3 ,
        price : 3000
    },
    {
        name : 'Berdo',
        id :4 ,
        price : 170
    },
]

//returning object 
const newItems = items.map(function(val){
    val.price = val.price+300;
    return val;
    /* return {
       name: val.name,
       id: val.id, 
       price: val.price + 300 
        } */
    
  
})
console.log('New array with change in price',newItems);
//flitering the data
const item = items.filter(function(value){
    if(value.price>1000)
    return true;
    else
    return false;

})
console.log('Greater than 1000 rupee',item);




