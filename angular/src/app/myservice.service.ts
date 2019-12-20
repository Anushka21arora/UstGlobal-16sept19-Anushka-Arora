import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MyserviceService {

  constructor(private http: HttpClient) { }
  add(product): Observable<any>{
    return this.http.post('http://localhost:8080/add', product);
  }
  searchByName(pname): Observable<any>{
    return this.http.get('http://localhost:8080/search-name?name=' + pname);
  }
  searchByCategory(category): Observable<any> {
    return this.http.get('http://localhost:8080/search-category?category=' + category);
  }
  searchByCompany(company): Observable<any> {
    return this.http.get('http://localhost:8080/search-company?company=' + company);
  }
   productList(): Observable<any> {
     return this.http.get('http://localhost:8080/all-product');
   }
   update(product): Observable<any> {
    return this.http.put('http://localhost:8080/update', product);
  }
}
