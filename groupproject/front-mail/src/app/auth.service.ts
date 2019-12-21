import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { throws } from 'assert';

const headeroption = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
@Injectable({
  providedIn: 'root'
})

export class AuthService {
  
  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/register',
      user);
  }

  login(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/login',
      user);
     
  }
  changePassword(pswd, email): Observable<any>
  {
    return this.http.post(
      'http://localhost:8080/login',pswd, email);
    
  }

}