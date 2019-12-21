import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { SecurityComponent } from './security/security.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { ComposeComponent } from './compose/compose.component';
import { MailComponent } from './inbox/mail/mail.component';
import { InboxComponent } from './inbox/inbox.component';
import { SentComponent } from './inbox/sent/sent.component';
import { ComposemailComponent } from './composemail/composemail.component';


const routes: Routes = [
  {
    path: 'register', component: RegisterComponent,
  },
  {
    path: 'security', component: SecurityComponent,
  },
  {
    path: '', component: HomeComponent,
  }
  ,
  {
    path: 'changepassword', component: ChangepasswordComponent,
  }
  ,
  {
    path: 'compose', component: ComposeComponent,
  },
  {
    path: 'mail', component: MailComponent,
  },
  {
    path: 'inbox', component: InboxComponent,
  },
  {
    path: 'sent', component: SentComponent,
  },
  {
    path: 'composeemail', component: ComposemailComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
