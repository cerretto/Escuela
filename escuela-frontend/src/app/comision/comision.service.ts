import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from '../curso/curso-models';
import { AlumnoCurso, Nota } from '../inscripcion/inscripcion-model';

@Injectable()
export class ComisionService {

  constructor(private http: HttpClient) { }

  getCursos() {
    return this.http.get<Curso[]>("http://localhost:8081/cursos");
  }

  getAlumnoCurso(idCurso: number) {
    return this.http.get<AlumnoCurso[]>("http://localhost:8081/inscripciones/getAlumnoCursoByCurso/"+idCurso);
  }

  getCurso(id: number) {
    return this.http.get<Curso>("http://localhost:8081/cursos/"+id);
  }

  getNotas(idAlumnoCurso: number) {
    return this.http.get<Nota[]>("http://localhost:8081/notas/getNotasByAlumnoCurso/"+idAlumnoCurso);
  }

}
