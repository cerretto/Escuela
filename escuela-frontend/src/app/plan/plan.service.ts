import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Plan } from './plan-models';
import { environment } from '../../environments/environment';

@Injectable()
export class PlanService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getPlanes() {
    return this.http.get<Plan[]>(this.endpoint + "/planes");
  }

  getPlan(id: Number) {
    return this.http.get<Plan>(this.endpoint + "/planes/" + id);
  }

  deletePlan(id: Number) {
    return this.http.delete(this.endpoint + "/planes/" + id);
  }

  savePlan(plan: Plan) {
    return this.http.post<Plan>(this.endpoint + "/planes", plan);
  }

  updatePlan(plan: Plan) {
    return this.http.put<Plan>(this.endpoint + "/planes/"+ plan.id, plan);
  }


}
