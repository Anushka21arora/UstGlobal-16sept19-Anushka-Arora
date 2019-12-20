import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-searchcompany',
  templateUrl: './searchcompany.component.html',
  styleUrls: ['./searchcompany.component.css']
})
export class SearchcompanyComponent implements OnInit {
  error: string;
  company: string;
  product: string;
  msg: string;
  constructor(private auth: MyserviceService) { }

  ngOnInit() {
  }
  getproduct(event) {
    console.log(event.target.value);
    this.error = null;
    this.company = event.target.value;
    this.auth.searchByCompany(this.company).subscribe(res => {
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
