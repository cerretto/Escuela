import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from '../curso/curso-models';

@Injectable()
export class ComisionService {

  constructor(private http: HttpClient) { }

  getCursos() {
    return this.http.get<Curso[]>("http://localhost:8081/cursos");
  }

}