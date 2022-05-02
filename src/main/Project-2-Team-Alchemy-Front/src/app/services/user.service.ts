import { Injectable } from '@angular/core';
import { Login } from '../models/login';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  url: string = 'http://localhost:5500/';

  constructor() { }

  
  async checkLogin(): Promise<Login> {
    
    let username = sessionStorage.getItem('Login-Auth');
    let httpResp = await fetch(this.url + 'login/' + username)
    if(httpResp && httpResp.status === 200){
      return await httpResp.json();
    }else{
      return null as any;
    }
  }

  async logIn(credentials:any): Promise<Login>{
    let credentialsJSON = JSON.stringify(credentials);
    let httpResp = await fetch(this.url + 'Login-Auth', {method:'POST' , body:credentialsJSON});
    if(httpResp && httpResp.status === 200){
    let user = await httpResp.json();
    sessionStorage.setItem('Login-Auth', user.username.toString());
    return user as any;
  }
    return null as any;
 }
}
