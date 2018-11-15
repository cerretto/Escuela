import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Materia } from '../materia/materia-models';
import { Evaluacion } from '../evaluacion/evaluacion-model';

@Injectable()
export class CargarNotasService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getEvaluacion(id: Number) {
    return this.http.get<Evaluacion>(this.endpoint + "/evaluaciones/" + id);
  }

//   deleteEvaluacion(id: Number) {
//     return this.http.delete(this.endpoint + "/evaluaciones/" + id);
//   }

//   saveEvaluacion(evaluacion: Evaluacion) {
//     return this.http.post<Evaluacion>(this.endpoint + "/evaluaciones", evaluacion);
//   }

//   updateEvaluacion(evaluacion: Evaluacion) {
//     return this.http.put<Evaluacion>(this.endpoint + "/evaluaciones/" + evaluacion.id, evaluacion);
//   }

  getMaterias(username: String) {
    return this.http.get<Materia[]>(this.endpoint + "/materias/"+username);
  }

  getEvaluaciones(idMateria: number) {
    return this.http.get<Evaluacion[]>(this.endpoint + "/evaluaciones/"+idMateria);
  }

}