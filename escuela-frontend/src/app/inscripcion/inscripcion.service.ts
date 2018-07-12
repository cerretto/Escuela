import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Inscripcion } from './inscripcion-model';
import { Curso } from '../curso/curso-models';
import { Alumno } from '../alumno/alumno.model';

@Injectable()
export class InscripcionService {

  constructor(private http: HttpClient) { }

  getInscripciones() {
    return this.http.get<Inscripcion[]>("http://localhost:8081/inscripciones");
  }

  getInscripcion(id: Number) {
    return this.http.get<Inscripcion>("http://localhost:8081/inscripciones/" + id);
  }

  deleteInscripcion(id: Number) {
    return this.http.delete("http://localhost:8081/inscripciones/" + id);
  }

  saveInscripcion(inscripcion: Inscripcion) {
    return this.http.post<Inscripcion>("http://localhost:8081/inscripciones", inscripcion);
  }

  updateInscripcion(inscripcion: Inscripcion) {
    return this.http.put<Inscripcion>("http://localhost:8081/inscripciones/" + inscripcion.id, inscripcion);
  }

  getCurso() {
    return this.http.get<Curso[]>("http://localhost:8081/cursos");
  }

  getAlumno() {
    return this.http.get<Alumno[]>("http://localhost:8081/alumnos");
  }

}