import { Component, OnInit } from '@angular/core';
import { Nivel } from '../nivel-models';
import { Plan } from '../../plan/plan-models';
import { NivelService } from '../nivel.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-nivel-detail',
  templateUrl: './nivel-detail.component.html',
  styleUrls: ['./nivel-detail.component.css']
})
export class NivelDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  nivel: Nivel = new Nivel();
  planCombo: Plan[];

  constructor(private service: NivelService,
                private route: ActivatedRoute,
                private router: Router) { }

  ngOnInit() {

    // this.route.paramMap
    // .switchMap((params: ParamMap) => this.service.getAviso(+params.get('id')))
    // .subscribe(aviso => this.aviso = aviso);
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getNivel(+params['id']).subscribe(
          nivel => {
            this.nivel = nivel;

            this.service.getPlanes().subscribe(
              data => {
                this.planCombo = data;
                this.nivel.plan = this.planCombo.filter(r => r.id === this.nivel.plan.id)[0];
              });
          });

      } else {
        this.service.getPlanes().subscribe(
          data => {
            this.planCombo = data;
          });
      }
    });

  }

  goBack() {
    this.router.navigate(['/menu/niveles']);
  }

  save() {
    console.log('func::save');
    this.service.saveNivel(this.nivel).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['/menu/niveles']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateNivel(this.nivel).subscribe(
      data => {
        console.log('ok');
        this.nivel = data;
        this.router.navigate(['/menu/niveles']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
