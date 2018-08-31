import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Alumno } from '../alumno/alumno.model';
import { Persona } from '../persona/persona-models';
import { environment } from '../../environments/environment';

@Injectable()
export class AlumnoService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getAlumnos() {
    return this.http.get<Alumno[]>(this.endpoint + "/alumnos");
  }

  getAlumno(id: Number) {
    return this.http.get<Alumno>(this.endpoint + "/alumnos/" + id);
  }

  deleteAlumno(id: Number) {
    return this.http.delete(this.endpoint + "/alumnos/" + id);
  }

  saveAlumno(alumno: Alumno) {
    return this.http.post<Alumno>(this.endpoint + "/alumnos", alumno);
  }

  updateAlumno(alumno: Alumno) {
    return this.http.put<Alumno>(this.endpoint + "/alumnos/"+ alumno.id, alumno);
  }

  getPersonas() {
    return this.http.get<Persona[]>(this.endpoint + "/personas");
  }

}