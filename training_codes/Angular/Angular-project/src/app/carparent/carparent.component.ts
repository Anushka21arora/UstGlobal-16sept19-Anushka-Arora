import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carparent',
  templateUrl: './carparent.component.html',
  styleUrls: ['./carparent.component.css']
})
export class CarparentComponent implements OnInit {
  selectedCar;
  Cars = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
    name : 'Audi',
    model :'Model 1945',
    dis : ' The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
    name : 'Mercedes',
    model :'Model 1945',
    dis : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
  },

  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/05/15/14/46/bmw-768688__340.jpg',
    name : 'BMW',
    model :'Model 1945',
    dis : ' The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/47/car-30984__340.png',
    name : 'Lambhergini',
    model :'Model 1945',
    dis : ' The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'

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
