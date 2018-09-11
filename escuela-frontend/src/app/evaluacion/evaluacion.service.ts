import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Evaluacion } from './evaluacion-model';
import { Materia } from '../materia/materia-models';

@Injectable()
export class EvaluacionService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getEvaluaciones() {
    return this.http.get<Evaluacion[]>(this.endpoint + "/evaluaciones");
  }

  getEvaluacion(id: Number) {
    return this.http.get<Evaluacion>(this.endpoint + "/evaluaciones/" + id);
  }

  deleteEvaluacion(id: Number) {
    return this.http.delete(this.endpoint + "/evaluaciones/" + id);
  }

  saveEvaluacion(evaluacion: Evaluacion) {
    return this.http.post<Evaluacion>(this.endpoint + "/evaluaciones", evaluacion);
  }

  updateEvaluacion(evaluacion: Evaluacion) {
    return this.http.put<Evaluacion>(this.endpoint + "/evaluaciones/" + evaluacion.id, evaluacion);
  }

  getMaterias() {
    return this.http.get<Materia[]>(this.endpoint + "/materias");
  }

}