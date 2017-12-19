import { Component, OnInit } from '@angular/core';
import { PlanService } from '../plan.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Plan } from '../plan-models';

@Component({
  selector: 'app-plan-detail',
  templateUrl: './plan-detail.component.html',
  styleUrls: ['./plan-detail.component.css']
})
export class PlanDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  plan: Plan = new Plan();

  constructor(private service: PlanService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getPlan(+params['id']).subscribe(
          plan => {
            this.plan = plan;
        });
      }
    });
  }

  goBack() {
    this.router.navigate(['menu/planes']);
  }

  save() {
    console.log('func::save');
    this.service.savePlan(this.plan).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/planes']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updatePlan(this.plan).subscribe(
      data => {
        console.log('ok');
        this.plan = data;
        this.router.navigate(['menu/planes']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
