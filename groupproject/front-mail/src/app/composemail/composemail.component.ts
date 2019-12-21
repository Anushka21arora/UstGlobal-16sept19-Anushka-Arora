import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-composemail',
  templateUrl: './composemail.component.html',
  styleUrls: ['./composemail.component.css']
})
export class ComposemailComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }
 compose(){
   this.router.navigateByUrl("/compose");
 }

}
