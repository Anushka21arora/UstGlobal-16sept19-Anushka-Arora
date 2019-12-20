import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  msg: string;
  error: string;
  constructor(private auth: MyserviceService) { }
  get name() {
    return this.add.get('name');
  }
  get category() {
    return this.add.get('category');
  }
  get company() {
    return this.add.get('company');
  }
  get qty() {
    return this.add.get('qty');
  }
  get price() {
    return this.add.get('price');
  }
  add = new FormGroup({
    name: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]),
    category: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]),
    company: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]),
    qty: new FormControl('', [Validators.required]),
    price: new FormControl('', [Validators.required])
  });
  addProduct(add) {
    this.auth.add(add.value).subscribe(res => {
      console.log(res);
      add.reset();
      if (res.statusCode === 201) {
        this.msg = JSON.stringify(res.message);
        return true;
      }
    }, err => {
      console.log(err);
      this.error = err.message;
    });
  }
  ngOnInit() {
  }

}
