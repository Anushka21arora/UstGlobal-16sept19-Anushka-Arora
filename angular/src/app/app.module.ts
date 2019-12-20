import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { RouterModule } from '@angular/router';
import {FormsModule} from '@angular/forms';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { SearchnameComponent } from './searchname/searchname.component';
import { SearchcategoryComponent } from './searchcategory/searchcategory.component';
import { SearchcompanyComponent } from './searchcompany/searchcompany.component';
import { ModifyproductComponent } from './modifyproduct/modifyproduct.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddproductComponent,
    HomeComponent,
    SearchnameComponent,
    SearchcategoryComponent,
    SearchcompanyComponent,
    ModifyproductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
