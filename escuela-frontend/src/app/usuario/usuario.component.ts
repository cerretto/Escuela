import { Component, OnInit } from '@angular/core';
import { UsuarioService } from './usuario.service';
import { Router } from '@angular/router';
import { Usuario } from './usuario-models';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  usuarios: Usuario[];

  constructor(private service: UsuarioService, private router: Router) { }

  ngOnInit() {
    this.service.getUsuarios().subscribe(data => {
      this.usuarios = data;
    });
  }

  goCreate(): void {
    this.router.navigate(['/menu/usuario-detail']);
  }

  goEdit(usuario: Usuario): void {
    this.router.navigate(['/menu/usuario-detail', usuario.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-administracion']);
  }

  delete(usuario: Usuario) {
    this.service.deleteUsuario(usuario.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }


}

