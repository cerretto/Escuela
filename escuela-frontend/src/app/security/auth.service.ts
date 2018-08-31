import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { JwtHelperService } from '@auth0/angular-jwt';
import { UserSession } from './auth-model';
import { environment } from '../../environments/environment';

@Injectable()
export class AuthService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient,
    private router: Router) { }

  login(userSession: UserSession) {
    this.logout();
    this.http.post(this.endpoint + '/login', userSession, { responseType: 'text' })
      .subscribe(
        res => {
          this.setSession(res);
          this.router.navigate(['/menu']);
        },
        err => {
          // mensaje d error para login
          // Observable.throw('error loggin in.');
        }
      );
  }

  private setSession(token: string) {
    localStorage.setItem('token', token);
  }

  logout() {
    localStorage.removeItem('token');
  }

  public isAuthenticated(): boolean {
    const token = localStorage.getItem('token');
    // Check whether the token is expired and return
    // true or false
    const helper = new JwtHelperService();
    return !helper.isTokenExpired(token);
  }
}
