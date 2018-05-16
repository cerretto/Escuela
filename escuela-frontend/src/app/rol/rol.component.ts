import { Component, OnInit } from '@angular/core';
import { RolService } from './rol.service';
import { Router } from '@angular/router';
import { Rol } from './rol-models';

@Component({
  selector: 'app-rol',
  templateUrl: './rol.component.html',
  styleUrls: ['./rol.component.css']
})
export class RolComponent implements OnInit {

  roles: Rol[];

  constructor(
    private service: RolService,
    private router: Router
  ) { }

  ngOnInit() {
    this.service.getRoles().subscribe( data => this.roles = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/rol-detail']);
  }

  goEdit(rol: Rol): void {
    this.router.navigate(['/menu/rol-detail', rol.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-administracion']);
  }

  delete(rol: Rol) {
    this.service.deleteRol(rol.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}





