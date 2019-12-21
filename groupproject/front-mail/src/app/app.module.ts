import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { SearchPipe } from './search.pipe';
import { RegisterComponent } from './register/register.component';
import { SecurityComponent } from './security/security.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { ComposeComponent } from './compose/compose.component';
import { MailComponent } from './inbox/mail/mail.component';
import { InboxComponent } from './inbox/inbox.component';
import { SentComponent } from './inbox/sent/sent.component';
import { ComposemailComponent } from './composemail/composemail.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    HeaderComponent,
    SearchPipe,
    RegisterComponent,
    SecurityComponent,
    ChangepasswordComponent,
    ComposeComponent,
    MailComponent,
    InboxComponent,
    SentComponent,
    ComposemailComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
