import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from './curso-models';
import { Nivel } from '../nivel/nivel-models';

@Injectable()
export class CursoService {

  constructor(private http: HttpClient) { }

  getCursos() {
    return this.http.get<Curso[]>("http://localhost:8081/cursos");
  }

  getCurso(id: Number) {
    return this.http.get<Curso>("http://localhost:8081/cursos/" + id);
  }

  deleteCurso(id: Number) {
    return this.http.delete("http://localhost:8081/cursos/" + id);
  }

  saveCurso(aviso: Curso) {
    return this.http.post<Curso>("http://localhost:8081/cursos", aviso);
  }

  updateCurso(aviso: Curso) {
    return this.http.put<Curso>("http://localhost:8081/cursos/"+ aviso.id, aviso);
  }

  getNivel() {
    return this.http.get<Nivel[]>("http://localhost:8081/niveles");
  }


}
