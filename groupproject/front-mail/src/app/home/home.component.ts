import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router:Router,private auth:AuthService) { }
error;
  register()
  {
    this.router.navigateByUrl("/register");
  }
  
  security()
  {
    this.router.navigateByUrl("/security");
  }
  ngOnInit() {
  }
  
  login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.login(form.value).subscribe(data => {
      console.log('Response of login', data);
      localStorage.setItem('userDetails', JSON.stringify(data));
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  


}
