import { Component, OnInit } from '@angular/core';
import { Materia } from '../materia-models';
import { Nivel } from '../../nivel/nivel-models';
import { MateriaService } from '../materia.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-materia-detail',
  templateUrl: './materia-detail.component.html',
  styleUrls: ['./materia-detail.component.css']
})
export class MateriaDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  materia: Materia = new Materia();
  nivelCombo: Nivel[];

  constructor(private service: MateriaService,
                private route: ActivatedRoute,
                private router: Router) { }

  ngOnInit() {

    // this.route.paramMap
    // .switchMap((params: ParamMap) => this.service.getMateria(+params.get('id')))
    // .subscribe(materia => this.materia = materia);
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getMateria(+params['id']).subscribe(
          nivel => {
            this.materia = nivel;

            this.service.getNivel().subscribe(
              data => {
                this.nivelCombo = data;
                this.materia.nivel = this.nivelCombo.filter(r => r.id === this.materia.nivel.id)[0];
              });
          });

      } else {
        this.service.getNivel().subscribe(
          data => {
            this.nivelCombo = data;
          });
      }
    });

  }

  goBack() {
    this.router.navigate(['/menu/materias']);
  }

  save() {
    console.log('func::save');
    this.service.saveMateria(this.materia).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['/menu/materias']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateMateria(this.materia).subscribe(
      data => {
        console.log('ok');
        this.materia = data;
        this.router.navigate(['/menu/materias']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
