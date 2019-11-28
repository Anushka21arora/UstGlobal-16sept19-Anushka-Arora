import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent ,
    AboutComponent ,
    HelpComponent ,
    LoginComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
   TwoWayBindingComponent,
   DirectiveComponent,
   NgIfComponent,
   NgForComponent,
   StructuralDirectiveComponent,
   NgSwitchComponent,
   CustomDirective,
   RegisterComponent,
   ReactiveFormComponent,
   ParentComponent,
   ChildComponent,
   CommentComponent,
   CommentDetailsComponent,
   DollarPipe,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent},
      {path : 'about' , component : AboutComponent},
      {path : 'help' , component : HelpComponent},
      {path : 'property-binding', component: PropertyBindingComponent},
      { path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way', component: TwoWayBindingComponent},
      {path: 'log', component: NgIfComponent},
      {path : 'ngfor', component: NgForComponent},
      {path : 'ngswitch', component: NgSwitchComponent},
      {path: 'register', component: RegisterComponent},
      {path : 'reactive-from', component: ReactiveFormComponent},
      {path : 'parent' , component : ParentComponent},
      {path: 'comment-details' , component : CommentDetailsComponent}
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
