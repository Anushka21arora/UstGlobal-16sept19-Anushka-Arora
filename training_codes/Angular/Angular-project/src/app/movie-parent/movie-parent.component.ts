import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-parent',
  templateUrl: './movie-parent.component.html',
  styleUrls: ['./movie-parent.component.css']
})
export class MovieParentComponent implements OnInit {
  selectedMovie;
  Movies = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg',
    name : 'Caption America',
    rating : 'Rating: 5/10',
    dis : ' Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/07/14/12/58/superhero-2503808__340.jpg',
    name : 'SuperMan',
    rating : 'Rating: 5/10',
    dis : 'Rating: 5/10 Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
    name : 'Avenger',
    rating : 'Rating: 5/10',
    dis : 'Rating: 5/10 Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
    name : 'Spider Man',
    rating : 'Rating: 5/10',
    dis : 'Rating: 5/10 Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'

  }
];
  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie) {
    this.selectedMovie = movie;
    console.log(movie);
  }

}