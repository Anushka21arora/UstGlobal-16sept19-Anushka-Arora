var brands=['bisleri','kingfisher','aquafina','kinley'];
console.log('For of Loop');
for(var element of brands){
      console.log('Brand =' ,element);

}
console.log('=============================');
console.log('For in Loop');
for(var index in brands){
    console.log('Brand =',brands[index]);
}
console.log('=============================');
var person ={
      name:'anu',
      age:22,

}
console.log('For in Loop for Objects');

for(var key in person){
    console.log('value =',person[key]);
}
console.log('=============================');

var movies = ['sholay','jurassic park','titanic'];
movies.forEach(function(value,index){//callbck function as a parameter
   console.log('Movies =',value);

})

//objects in array
var items = [{
        items : 'bangles',
        id : 1,
        price : 100,
},
{
    items : 'eyeliner',
    id : 2,
    price: 500,
},
{
    items : 'shoes',
    id : 3 ,
    price: 5000 ,
},
{
    items : 'dress',
    id : 4 ,
    price: 3000 ,
}

]
items.forEach(function(value,index){
    console.log('items=' ,value);
    console.log('index of item = ' ,index);
})

