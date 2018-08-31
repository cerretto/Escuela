import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Materia } from './materia-models';
import { Nivel } from '../nivel/nivel-models';
import { environment } from '../../environments/environment';

@Injectable()
export class MateriaService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getMaterias() {
    return this.http.get<Materia[]>(this.endpoint + "/materias");
  }

  getMateria(id: Number) {
    return this.http.get<Materia>(this.endpoint + "/materias/" + id);
  }

  deleteMateria(id: Number) {
    return this.http.delete(this.endpoint + "/materias/" + id);
  }

  saveMateria(Materia: Materia) {
    return this.http.post<Materia>(this.endpoint + "/materias", Materia);
  }

  updateMateria(Materia: Materia) {
    return this.http.put<Materia>(this.endpoint + "/materias/"+ Materia.id, Materia);
  }

  getNivel() {
    return this.http.get<Nivel[]>(this.endpoint + "/niveles");
  }

}