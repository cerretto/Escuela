import { Component, OnInit } from '@angular/core';
import { AuthService } from '../security/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit() {
  }

  salir() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

}
