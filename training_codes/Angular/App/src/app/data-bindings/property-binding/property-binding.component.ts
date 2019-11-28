import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
name: string = 'Anushka';
imgUrl: string ='https://cdn.pixabay.com/photo/2017/11/04/11/25/fog-2917232__340.jpg';
address : string='Btm 2nd Stage';
colorName: string = 'red';
isActive: boolean = false;
colspanvalue :number = 2;
  constructor() {}
  ngOnInit() {
  // setInterval(()=>{
  //   this.colorName ='brown';
  // },2000);
setInterval(() => {
  this.colorName ='brown';
  this.isActive = !this.isActive;
},2000);
  }


}
