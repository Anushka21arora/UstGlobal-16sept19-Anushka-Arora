import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private auth:AuthService,private router:Router) { }

  
  ngOnInit() {
  }
error:String;

  register(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.registerUser(form.value).subscribe(data => {
      console.log('Response of login', data);      
      localStorage.setItem('userDetails', JSON.stringify(data));
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
}
}