let myName : string ="Anushka";
console.log(myName ,typeof myName);

let age = 22;
console.log(age, typeof age);

let mobileNumber : number;
console.log(mobileNumber, typeof mobileNumber);

let address;
address ="abc";
address = 20
console.log(address,typeof address);
 
let calAge = function():void {
    console.log('age is 21');
}
calAge();


class Person{
    constructor(public name :string, public age:number){

    }

}
let p = new Person("anu",22);
console.log(p);

class Student extends Person{
    constructor(name:string, age:number,public rollno:number)
    {
        super (name,age);
    }
    


}
let s = new Student("anu",22,1);
console.log(s);
