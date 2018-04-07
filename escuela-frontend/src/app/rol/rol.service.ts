import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Rol } from './rol-models';

@Injectable()
export class RolService {

  constructor(private http: HttpClient) { }

  getRoles() {
    return this.http.get<Rol[]>("http://localhost:8081/roles");
  }

  getRol(id: Number) {
    return this.http.get<Rol>("http://localhost:8081/roles/" + id);
  }

  deleteRol(id: Number) {
    return this.http.delete("http://localhost:8081/roles/" + id);
  }

  saveRol(rol: Rol) {
    return this.http.post<Rol>("http://localhost:8081/roles", rol);
  }

  updateRol(rol: Rol) {
    return this.http.put<Rol>("http://localhost:8081/roles/"+ rol.id, rol);
  }

}