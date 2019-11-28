import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
   movies;
   mov;
  constructor(private http:HttpClient) {

   }
  getmovie(event)
 {
 this.mov = event.target.value;
  this.http.get<any>('http://www.omdbapi.com/?tt3896198&apikey=2ad7332c&s='+this.mov).subscribe(data => {
    this.movies = data.Search;
    }, err => {
      console.log(err);
    }, () => {
      console.log('movie got succesfully');
    });
  }
  ngOnInit() {
  }

}
