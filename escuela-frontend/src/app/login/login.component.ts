import { Component, OnInit } from '@angular/core';
import { UserSession } from '../security/auth-model';
import { AuthService } from '../security/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login: UserSession = new UserSession();

  constructor(private authService: AuthService) { }

  ngOnInit() {
    this.authService.logout();
  }

  onSubmit() {
    this.authService.login(this.login);
  }

}
