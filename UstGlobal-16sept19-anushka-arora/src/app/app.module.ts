import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { MoviesComponent } from './movies/movies.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    AddMovieComponent,
    MoviesComponent
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
     RouterModule.forRoot([
      {path : 'login' , component: LoginComponent},
      {path : 'addmovie' , component: AddMovieComponent},
      {path: 'movie', component: MoviesComponent}
     ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
