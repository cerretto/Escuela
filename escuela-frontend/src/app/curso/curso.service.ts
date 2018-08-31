import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from './curso-models';
import { Nivel } from '../nivel/nivel-models';
import { environment } from '../../environments/environment';

@Injectable()
export class CursoService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getCursos() {
    return this.http.get<Curso[]>(this.endpoint + "/cursos");
  }

  getCurso(id: Number) {
    return this.http.get<Curso>(this.endpoint + "/cursos/" + id);
  }

  deleteCurso(id: Number) {
    return this.http.delete(this.endpoint + "/cursos/" + id);
  }

  saveCurso(aviso: Curso) {
    return this.http.post<Curso>(this.endpoint + "/cursos", aviso);
  }

  updateCurso(aviso: Curso) {
    return this.http.put<Curso>(this.endpoint + "/cursos/"+ aviso.id, aviso);
  }

  getNivel() {
    return this.http.get<Nivel[]>(this.endpoint + "/niveles");
  }


}
