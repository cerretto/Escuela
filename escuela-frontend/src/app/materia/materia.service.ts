import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Materia } from './materia-models';
import { Nivel } from '../nivel/nivel-models';

@Injectable()
export class MateriaService {

  constructor(private http: HttpClient) { }

  getMaterias() {
    return this.http.get<Materia[]>("http://localhost:8081/materias");
  }

  getMateria(id: Number) {
    return this.http.get<Materia>("http://localhost:8081/materias/" + id);
  }

  deleteMateria(id: Number) {
    return this.http.delete("http://localhost:8081/materias/" + id);
  }

  saveMateria(Materia: Materia) {
    return this.http.post<Materia>("http://localhost:8081/materias", Materia);
  }

  updateMateria(Materia: Materia) {
    return this.http.put<Materia>("http://localhost:8081/materias/"+ Materia.id, Materia);
  }

  getNivel() {
    return this.http.get<Nivel[]>("http://localhost:8081/niveles");
  }

}