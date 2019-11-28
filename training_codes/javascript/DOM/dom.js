let h1Element = document.getElementById('demo');
console.log('Element',h1Element);
console.log('Element Text',h1Element.textContent);
h1Element.textContent = 'Good evening';
console.log('Element Text',h1Element.textContent);
console.log('=========================');
let buttonElement = document.createElement('button');
buttonElement.textContent='Click Me!!!!';
console.log('Button element',buttonElement);

document.body.appendChild(buttonElement);
//list
let ulEle = document.createElement('ul');
let li1Ele =document.createElement('li');
let li2Ele= document.createElement('li');
let li3Ele= document.createElement('li');
li1Ele.textContent = 'java';
li2Ele.textContent = 'Sql';
li3Ele.textContent = 'Javascript';


ulEle.appendChild(li1Ele);
ulEle.appendChild(li2Ele);
ulEle.appendChild(li3Ele);
document.body.appendChild(ulEle);
h1Element.style.color ='red';
h1Element.style.fontFamily='cursive';


function showMessage(){
    alert('Hi Hello Welcome!!!');
}
function changeColor(){
  let pElement = document.getElementById('mover');
  pElement.style.color='green';

}
function removeColor(){
    let p1Element = document.getElementById('mover');
    p1Element.style.color='black';
}
function printHello(){
    //console.log('Hello');
   let userName = document.getElementById('username').value //when we take data from user use value at that  time
  document.getElementById('showusername').textContent = userName;
}
let name ='anushka'
let age =21
let phoneno = 7007123456
console.log(`Name is ${name} age is ${age} phon no is ${phoneno} `)
console.log(`2+2=${2+2}`)