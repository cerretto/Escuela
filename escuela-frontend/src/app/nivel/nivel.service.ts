import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Nivel } from './nivel-models';
import { Plan } from '../plan/plan-models';

@Injectable()
export class NivelService {

  constructor(private http: HttpClient) { }

  getNiveles() {
    return this.http.get<Nivel[]>("http://localhost:8081/niveles");
  }

  getNivel(id: Number) {
    return this.http.get<Nivel>("http://localhost:8081/niveles/" + id);
  }

  deleteNivel(id: Number) {
    return this.http.delete("http://localhost:8081/niveles/" + id);
  }

  saveNivel(Nivel: Nivel) {
    return this.http.post<Nivel>("http://localhost:8081/niveles", Nivel);
  }

  updateNivel(Nivel: Nivel) {
    return this.http.put<Nivel>("http://localhost:8081/niveles/"+ Nivel.id, Nivel);
  }

  getPlanes() {
    return this.http.get<Plan[]>("http://localhost:8081/planes");
  }

}
