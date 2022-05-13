import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  credentials = {
    username:'',
    password:''
  };

  constructor(private userServ:UserService,
              private router:Router) { }

  ngOnInit(): void {
  }

  async register(credentials:any){
    let credentialsJSON = JSON.stringify(credentials);
    let httpResp = await fetch("http://localhost:8080"  + '/users/register', {method:'POST' ,
                                                                            body:credentialsJSON,
                                                                            headers: {
                                                                            'Content-Type': 'application/json'
                                                                          }});
    if(httpResp && httpResp.status === 200){
      let user = await httpResp.json();
      sessionStorage.setItem('Login-Auth', user.username.toString());
      sessionStorage.setItem('user-id', user.id.toString());
      this.router.navigate(['home']);
    }
  }
}
