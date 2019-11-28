import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {
firebaseUrl = 'https://ust-ty-b3239.firebaseio.com/';

  constructor(public http: HttpClient) { }

  postUser(data) {
console.log('service', data);
return this.http.post(`${this.firebaseUrl}/users.json`, data);

  }


  getUsers() {
    return this.http.get(`${this.firebaseUrl}/users.json`).pipe(
      map(data => {
        let newArray = [];
        for (let key in data) {
          newArray.push ({...data[key], id : key});
        }
        return newArray;
      })
    );
  }
  deleteUser(id) { 
    return this.http.delete(`${this.firebaseUrl}/users/${id}.json`);

  }
  updateUser(id,data){
     return this.http.put(`${this.firebaseUrl}/users/${id}.json`,data);
  }
}
