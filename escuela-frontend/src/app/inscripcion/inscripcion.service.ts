import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AlumnoCurso } from './inscripcion-model';
import { Curso } from '../curso/curso-models';
import { Alumno } from '../alumno/alumno.model';

@Injectable()
export class InscripcionService {

  constructor(private http: HttpClient) { }

  getInscripciones() {
    return this.http.get<AlumnoCurso[]>("http://localhost:8081/inscripciones");
  }

  getInscripcion(id: Number) {
    return this.http.get<AlumnoCurso>("http://localhost:8081/inscripciones/" + id);
  }

  deleteInscripcion(id: Number) {
    return this.http.delete("http://localhost:8081/inscripciones/" + id);
  }

  saveInscripcion(alumnoCurso: AlumnoCurso) {
    return this.http.post<AlumnoCurso>("http://localhost:8081/inscripciones", alumnoCurso);
  }

  updateInscripcion(alumnoCurso: AlumnoCurso) {
    return this.http.put<AlumnoCurso>("http://localhost:8081/inscripciones/" + alumnoCurso.id, alumnoCurso);
  }

  getCurso() {
    return this.http.get<Curso[]>("http://localhost:8081/cursos");
  }

  getAlumno() {
    return this.http.get<Alumno[]>("http://localhost:8081/alumnos");
  }

}