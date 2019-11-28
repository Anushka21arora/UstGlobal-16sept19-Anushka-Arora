import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bikec',
  templateUrl: './bikec.component.html',
  styleUrls: ['./bikec.component.css']
})
export class BikecComponent implements OnInit {
@Input() bike;
  constructor() { }

  ngOnInit() {
  }

}
