import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-searchcategory',
  templateUrl: './searchcategory.component.html',
  styleUrls: ['./searchcategory.component.css']
})
export class SearchcategoryComponent implements OnInit {
  error: string;
  category: string;
  product: string;
  msg: string;
  constructor(private auth: MyserviceService) { }

  ngOnInit() {
  }
  getproduct(event) {
    console.log(event.target.value);
    this.error = null;
    this.category = event.target.value;
    this.auth.searchByCategory(this.category).subscribe(res => {
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
