import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Alumno } from '../alumno/alumno.model';
import { Persona } from '../persona/persona-models';

@Injectable()
export class AlumnoService {

  constructor(private http: HttpClient) { }

  getAlumnos() {
    return this.http.get<Alumno[]>("http://localhost:8081/alumnos");
  }

  getAlumno(id: Number) {
    return this.http.get<Alumno>("http://localhost:8081/alumnos/" + id);
  }

  deleteAlumno(id: Number) {
    return this.http.delete("http://localhost:8081/alumnos/" + id);
  }

  saveAlumno(alumno: Alumno) {
    return this.http.post<Alumno>("http://localhost:8081/alumnos", alumno);
  }

  updateAlumno(alumno: Alumno) {
    return this.http.put<Alumno>("http://localhost:8081/alumnos/"+ alumno.id, alumno);
  }

  getPersonas() {
    return this.http.get<Persona[]>("http://localhost:8081/personas");
  }

}