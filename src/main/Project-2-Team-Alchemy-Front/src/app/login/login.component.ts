import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Login } from '../models/login';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  credentials = {
    username:'',
    password:''
  };

  constructor (private userServ: UserService){}
  
  // this is called by angular when the componenet initializes
  ngOnInit(): void {
  // fetch 
    this.getLoggedInUser();
  }

  async getLoggedInUser(){
    await this.userServ.checkLogin();
  }
  
  logIn(){
    this.userServ.logIn(this.credentials);
  }

}
