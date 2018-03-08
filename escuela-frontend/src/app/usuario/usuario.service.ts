import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Usuario } from './usuario-models';

@Injectable()
export class UsuarioService {

  constructor(private http: HttpClient) { }

  getUsuarios() {
    return this.http.get<Usuario[]>("http://localhost:8081/usuarios");
  }

  getUsuario(id: Number) {
    return this.http.get<Usuario>("http://localhost:8081/usuarios/" + id);
  }

  deleteUsuario(id: Number) {
    return this.http.delete("http://localhost:8081/usuarios/" + id);
  }

  saveUsuario(usuario: Usuario) {
    return this.http.post<Usuario>("http://localhost:8081/usuarios", usuario);
  }

  updateUsuario(usuario: Usuario) {
    return this.http.put<Usuario>("http://localhost:8081/usuarios/"+ usuario.id, usuario);
  }


}