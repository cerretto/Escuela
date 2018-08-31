import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Rol } from './rol-models';
import { environment } from '../../environments/environment';

@Injectable()
export class RolService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getRoles() {
    return this.http.get<Rol[]>(this.endpoint + "/roles");
  }

  getRol(id: Number) {
    return this.http.get<Rol>(this.endpoint + "/roles/" + id);
  }

  deleteRol(id: Number) {
    return this.http.delete(this.endpoint + "/roles/" + id);
  }

  saveRol(rol: Rol) {
    return this.http.post<Rol>(this.endpoint + "/roles", rol);
  }

  updateRol(rol: Rol) {
    return this.http.put<Rol>(this.endpoint + "/roles/"+ rol.id, rol);
  }

}