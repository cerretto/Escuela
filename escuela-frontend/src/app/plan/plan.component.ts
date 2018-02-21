import { Component, OnInit } from '@angular/core';
import { PlanService } from './plan.service';
import { Router } from '@angular/router';
import { Plan } from './plan-models';

@Component({
  selector: 'app-plan',
  templateUrl: './plan.component.html',
  styleUrls: ['./plan.component.css']
})
export class PlanComponent implements OnInit {

  planes: Plan[];

  constructor(private service: PlanService,  private router: Router) { }

  ngOnInit() {
    this.service.getPlanes().subscribe( data => this.planes = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/plan-detail']);
  }

  goEdit(plan: Plan): void {
    this.router.navigate(['/menu/plan-detail', plan.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-definicion']);
  }

  delete(plan: Plan) {
    this.service.deletePlan(plan.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }


}
