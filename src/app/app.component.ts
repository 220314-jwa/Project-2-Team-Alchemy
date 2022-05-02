import { Component, OnInit } from '@angular/core';
import { Login } from './models/login';
import { UserService } from './services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'project-2';
  loggedInUser:Login;
}

constructor(private userServ:UserService);

ngOnInit(): void {
  this.getLoggedInUser();
}

async getLoggedInUser(){
  this.loggedInUser = await this.userServ.checkLogin();
}