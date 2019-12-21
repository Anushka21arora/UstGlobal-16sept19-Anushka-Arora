import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {
msg;
error;
  constructor(private auth:AuthService) { }

  ngOnInit() {
  }
changepassword(form:NgForm)
{
  const pswd = form.value.password;
    const cpswd = form.value.cpassword;

    if (pswd === cpswd) {
      const email = JSON.parse(localStorage.getItem('userDetails')).userBean.email;
      this.auth.changePassword(pswd, email).subscribe(res => {

        console.log(res);
        if (res.statusCode === 201) {
          this.msg = JSON.stringify(res.message);
          return true;
        }
      }, err => {
        console.log(err);
        this.error = err.message;
      });
    } else {
      this.msg = 'Password not matched';
    }
 
}
}
