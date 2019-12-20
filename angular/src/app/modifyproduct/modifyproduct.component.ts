import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-modifyproduct',
  templateUrl: './modifyproduct.component.html',
  styleUrls: ['./modifyproduct.component.css']
})
export class ModifyproductComponent implements OnInit {
product: any;
selectedUser:any;
  constructor(private auth: MyserviceService) {
    this.productList();
   }

  ngOnInit() {
  }
  selectUser(user: any) {
    console.log(user);
    this.selectedUser = user;
     }
  productList() {
    this.auth.productList().subscribe(response => {
      console.log(response);
      this.product = response.productInfo;
     }, error => {
        console.log(error);
      });
   }
   updateData(form) {
    console.log(form.value);
    this.auth.update(form.value).subscribe(data => {
      console.log(data);
      this.productList();
  }, err => {
   console.log(err);
  });
}
}
