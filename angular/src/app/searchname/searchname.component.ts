import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-searchname',
  templateUrl: './searchname.component.html',
  styleUrls: ['./searchname.component.css']
})
export class SearchnameComponent implements OnInit {
  error: string;
  name: string;
  product: string;
  msg: string;
  constructor(private auth: MyserviceService) { }

  ngOnInit() {

  }
  getproduct(event) {
    console.log(event.target.value);
    this.error = null;
    this.name = event.target.value;
    this.auth.searchByName(this.name).subscribe(res => {
      console.log(res);
      this.product = res.productInfo;
      if (res.statusCode === 401) {
        this.msg = JSON.stringify(res.message);
        return true;
      } else {
        this.msg = '';
        return true;
      }
  }, err => {
      console.log(err);
      this.error = err.message;
    });
  }

}
