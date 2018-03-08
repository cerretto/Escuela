import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Plan } from './plan-models';

@Injectable()
export class PlanService {

  constructor(private http: HttpClient) { }

  getPlanes() {
    return this.http.get<Plan[]>("http://localhost:8081/planes");
  }

  getPlan(id: Number) {
    return this.http.get<Plan>("http://localhost:8081/planes/" + id);
  }

  deletePlan(id: Number) {
    return this.http.delete("http://localhost:8081/planes/" + id);
  }

  savePlan(plan: Plan) {
    return this.http.post<Plan>("http://localhost:8081/planes", plan);
  }

  updatePlan(plan: Plan) {
    return this.http.put<Plan>("http://localhost:8081/planes/"+ plan.id, plan);
  }


}
