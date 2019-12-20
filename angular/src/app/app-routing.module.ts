import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { HomeComponent } from './home/home.component';
import { SearchnameComponent } from './searchname/searchname.component';
import { SearchcategoryComponent } from './searchcategory/searchcategory.component';
import { SearchcompanyComponent } from './searchcompany/searchcompany.component';
import { ModifyproductComponent } from './modifyproduct/modifyproduct.component';


const routes: Routes = [
  {path: 'addproduct', component: AddproductComponent},
  {path: '', component: HomeComponent},
  {path: 'searchbyname', component: SearchnameComponent},
  {path: 'searchbycategory', component: SearchcategoryComponent},
  {path: 'searchbycompany', component: SearchcompanyComponent},
  {path: 'update', component: ModifyproductComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
