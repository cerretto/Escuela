import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserSession } from './auth-model';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AuthService {

  constructor(private http: HttpClient) { }

  login(userSession: UserSession) {
    this.logout();
    this.http.post<string>('"http://localhost:8081/login', userSession)
      .subscribe(
        res => {
          this.setSession(res);
        },
        err => {
          Observable.throw('error loggin in.');
        }
      );
  }

  private setSession(token: string) {
    localStorage.setItem('token', token);
  }

  logout() {
    localStorage.removeItem('token');
  }
}
