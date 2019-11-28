import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
 selectedCar;
  Cars = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
    name : 'Audi'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
    name : 'Mercedes'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/05/15/14/46/bmw-768688__340.jpg',
    name : 'BMW'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/47/car-30984__340.png',
    name : 'Lambhergini'
  }
];
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    this.selectedCar = car;
    console.log(car);
  }

}
