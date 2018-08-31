import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AlumnoCurso } from './inscripcion-model';
import { Curso } from '../curso/curso-models';
import { Alumno } from '../alumno/alumno.model';
import { environment } from '../../environments/environment';

@Injectable()
export class InscripcionService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getInscripciones() {
    return this.http.get<AlumnoCurso[]>(this.endpoint + "/inscripciones");
  }

  getInscripcion(id: Number) {
    return this.http.get<AlumnoCurso>(this.endpoint + "/inscripciones/" + id);
  }

  deleteInscripcion(id: Number) {
    return this.http.delete(this.endpoint + "/inscripciones/" + id);
  }

  saveInscripcion(alumnoCurso: AlumnoCurso) {
    return this.http.post<AlumnoCurso>(this.endpoint + "/inscripciones", alumnoCurso);
  }

  updateInscripcion(alumnoCurso: AlumnoCurso) {
    return this.http.put<AlumnoCurso>(this.endpoint + "/inscripciones/" + alumnoCurso.id, alumnoCurso);
  }

  getCurso() {
    return this.http.get<Curso[]>(this.endpoint + "/cursos");
  }

  getAlumno() {
    return this.http.get<Alumno[]>(this.endpoint + "/alumnos");
  }

}