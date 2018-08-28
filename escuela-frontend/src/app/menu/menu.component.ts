import { Component, OnInit } from '@angular/core';
import { AuthService } from '../security/auth.service';
import { Router } from '@angular/router';
import { UserSession } from '../security/auth-model';
import { JwtHelperService } from '@auth0/angular-jwt';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  user: UserSession = new UserSession();

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit() {
    let token = localStorage.getItem('token');
    let helper = new JwtHelperService();
    let pepito = helper.decodeToken(token);
    this.user.rol = pepito.auth[0].authority;
    this.user.username = pepito.sub;
  }

  salir() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  isAdmin() {
    if (this.user.rol === 'ADMIN') {
      return true;
    } else {
      return false;
    }
  }

}
