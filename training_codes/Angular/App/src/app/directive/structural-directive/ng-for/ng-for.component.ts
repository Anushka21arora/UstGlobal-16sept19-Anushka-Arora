import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [
    {
      img : 'https://cdn.pixabay.com/photo/2018/05/29/23/18/potato-3440360__340.jpg',
      name: 'potato',
      price: 200
    },
    {
      img : 'https://cdn.pixabay.com/photo/2018/05/29/23/18/potato-3440360__340.jpg',
      name: 'eggs',
      price: 50
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
