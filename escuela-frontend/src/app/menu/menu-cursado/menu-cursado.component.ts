import { Component, OnInit } from '@angular/core';
import { UserSession } from '../../security/auth-model';
import { JwtHelperService } from '@auth0/angular-jwt';

@Component({
  selector: 'app-menu-cursado',
  templateUrl: './menu-cursado.component.html',
  styleUrls: ['./menu-cursado.component.css']
})
export class MenuCursadoComponent implements OnInit {

  user: UserSession = new UserSession();

  constructor() { }

  ngOnInit() {
    let token = localStorage.getItem('token');
    let helper = new JwtHelperService();
    let pepito = helper.decodeToken(token);
    this.user.rol = pepito.auth[0].authority;
    this.user.username = pepito.sub;
  }

  isAdmin() {
    if (this.user.rol === 'ADMIN') {
      return true;
    } else {
      return false;
    }
  }

}
