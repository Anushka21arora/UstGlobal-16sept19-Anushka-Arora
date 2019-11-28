import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarparentComponent } from './carparent/carparent.component';
import { CarchildComponent } from './carchild/carchild.component';
import { BikepComponent } from './bikep/bikep.component';
import { BikecComponent } from './bikec/bikec.component';
import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';
import { MovieParentComponent } from './movie-parent/movie-parent.component';
import { MovieChildComponent } from './movie-child/movie-child.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarparentComponent,
    CarchildComponent,
    BikepComponent,
    BikecComponent,
    LaptopParentComponent,
    LaptopChildComponent,
    MovieParentComponent,
    MovieChildComponent,
    MobileParentComponent,
    MobileChildComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
{path: '' , component: HomeComponent},
{path: 'carparent' , component: CarparentComponent},
{path: 'bike' , component : BikepComponent},
{path: 'laptop', component : LaptopParentComponent},
{path : 'movie', component : MovieParentComponent},
{path : 'mobile', component : MobileParentComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
