import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule } from '@angular/forms';
import { UserService } from './services/user.service';

const routes: Routes = [
  {path: 'login-component', component: LoginComponent},
  {path: 'signup-component', component: SignupComponent}
];

@NgModule({


  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    FormsModule
  ],
  exports:[RouterModule],
  providers: [
    UserService
  ],
  bootstrap: [AppComponent]

})
export class AppModule { }
export class AppRoutingModule{ }