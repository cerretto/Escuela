import { Component, OnInit } from '@angular/core';
import { AlumnoCurso } from '../inscripcion-model';
import { InscripcionService } from '../inscripcion.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';
import { Curso } from '../../curso/curso-models';
import { Alumno } from '../../alumno/alumno.model';
import { MatSelectModule } from '@angular/material/select';

export interface Food {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-inscripcion-detail',
  templateUrl: './inscripcion-detail.component.html',
  styleUrls: ['./inscripcion-detail.component.css']
})
export class InscripcionDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  alumnoCurso: AlumnoCurso = new AlumnoCurso();
  cursoCombo: Curso[];
  alumnoCombo: Alumno[];
  anios: number[] = [2018,2019,2020,2021];
  foods: Food[] = [
    {value: 'steak-0', viewValue: 'Steak'},
    {value: 'pizza-1', viewValue: 'Pizza'},
    {value: 'tacos-2', viewValue: 'Tacos'}
  ];

  constructor(private service: InscripcionService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {

    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getInscripcion(+params['id']).subscribe(
          inscripcion => {
            this.alumnoCurso = inscripcion;

            this.service.getCurso().subscribe(
              data => {
                this.cursoCombo = data;
                this.alumnoCurso.curso = this.cursoCombo.filter(r => r.id === this.alumnoCurso.curso.id)[0];
              });
            this.service.getAlumno().subscribe(
              data => {
                this.alumnoCombo = data;
                this.alumnoCurso.alumno = this.alumnoCombo.filter(r => r.id === this.alumnoCurso.alumno.id)[0];
              });
          });

      } else {
        this.service.getCurso().subscribe(
          data => {
            this.cursoCombo = data;
          });
        this.service.getAlumno().subscribe(
          data => {
            this.alumnoCombo = data;
          });
      }
    });

  }

  goBack() {
    this.router.navigate(['menu/inscripciones']);
  }

  save() {
    console.log('func::save');
    this.service.saveInscripcion(this.alumnoCurso).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/inscripciones']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateInscripcion(this.alumnoCurso).subscribe(
      data => {
        console.log('ok');
        this.alumnoCurso = data;
        this.router.navigate(['menu/inscripciones']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
