import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from '../curso/curso-models';
import { AlumnoCurso, Nota } from '../inscripcion/inscripcion-model';
import { environment } from '../../environments/environment';

@Injectable()
export class ComisionService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getCursos() {
    return this.http.get<Curso[]>(this.endpoint + "/cursos");
  }

  getAlumnoCurso(idCurso: number) {
    return this.http.get<AlumnoCurso[]>(this.endpoint + "/inscripciones/getAlumnoCursoByCurso/"+idCurso);
  }

  getCurso(id: number) {
    return this.http.get<Curso>(this.endpoint + "/cursos/"+id);
  }

  getNotas(idAlumnoCurso: number) {
    return this.http.get<Nota[]>(this.endpoint + "/notas/getNotasByAlumnoCurso/"+idAlumnoCurso);
  }

}
