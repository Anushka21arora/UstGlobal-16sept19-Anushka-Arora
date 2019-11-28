import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikep',
  templateUrl: './bikep.component.html',
  styleUrls: ['./bikep.component.css']
})
export class BikepComponent implements OnInit {
 selectedBike;
 Bikes = [
   {
     image : 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
     name : 'ABC',
     // tslint:disable-next-line: max-line-length
     model: 'Model : 1945',
     dis : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
   },
   {
    image : 'https://cdn.pixabay.com/photo/2014/07/31/23/37/motorbike-407186__340.jpg',
    name : 'PQRS',
    model: 'Model : 1945',
    dis :' The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'

  },
  {
    image : 'https://cdn.pixabay.com/photo/2016/02/19/11/23/bicycle-1209682__340.jpg',
    name : 'XYZ',
    model: 'Model : 1945',
    dis :' The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'

  },
  ];


  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    this.selectedBike = bike;
    console.log(bike);
  }

}
