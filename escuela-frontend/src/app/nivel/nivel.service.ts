import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Nivel } from './nivel-models';
import { Plan } from '../plan/plan-models';
import { environment } from '../../environments/environment';

@Injectable()
export class NivelService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getNiveles() {
    return this.http.get<Nivel[]>(this.endpoint + "/niveles");
  }

  getNivel(id: Number) {
    return this.http.get<Nivel>(this.endpoint + "/niveles/" + id);
  }

  deleteNivel(id: Number) {
    return this.http.delete(this.endpoint + "/niveles/" + id);
  }

  saveNivel(Nivel: Nivel) {
    return this.http.post<Nivel>(this.endpoint + "/niveles", Nivel);
  }

  updateNivel(Nivel: Nivel) {
    return this.http.put<Nivel>(this.endpoint + "/niveles/"+ Nivel.id, Nivel);
  }

  getPlanes() {
    return this.http.get<Plan[]>(this.endpoint + "/planes");
  }

}
