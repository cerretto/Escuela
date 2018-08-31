import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Usuario } from './usuario-models';
import { environment } from '../../environments/environment';

@Injectable()
export class UsuarioService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getUsuarios() {
    return this.http.get<Usuario[]>(this.endpoint + "/usuarios");
  }

  getUsuario(id: Number) {
    return this.http.get<Usuario>(this.endpoint + "/usuarios/" + id);
  }

  deleteUsuario(id: Number) {
    return this.http.delete(this.endpoint + "/usuarios/" + id);
  }

  saveUsuario(usuario: Usuario) {
    return this.http.post<Usuario>(this.endpoint + "/usuarios", usuario);
  }

  updateUsuario(usuario: Usuario) {
    return this.http.put<Usuario>(this.endpoint + "/usuarios"+ usuario.id, usuario);
  }


}