import { Component, OnInit } from '@angular/core';
import { Inscripcion } from '../inscripcion-model';
import { InscripcionService } from '../inscripcion.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';
import { Curso } from '../../curso/curso-models';

@Component({
  selector: 'app-inscripcion-detail',
  templateUrl: './inscripcion-detail.component.html',
  styleUrls: ['./inscripcion-detail.component.css']
})
export class InscripcionDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  inscripcion: Inscripcion = new Inscripcion();
  cursoCombo: Curso[];
  //alumnoCombo: Alumno[];

  constructor(private service: InscripcionService,
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
        this.service.getInscripcion(+params['id']).subscribe(
          inscripcion => {
            this.inscripcion = inscripcion;

            this.service.getCurso().subscribe(
              data => {
                this.cursoCombo = data;
                this.inscripcion.curso = this.cursoCombo.filter(r => r.id === this.inscripcion.curso.id)[0];
              });
            // this.service.getAlumno().subscribe(
            //   data => {
            //     this.alumnoCombo = data;
            //     this.inscripcion.alumno = this.alumnoCombo.filter(r => r.id === this.inscripcion.alumno.id)[0];
            //   });
          });

      } else {
        this.service.getCurso().subscribe(
          data => {
            this.cursoCombo = data;
          });
        // this.service.getAlumno().subscribe(
        //   data => {
        //     this.alumnoCombo = data;
        //   });
      }
    });

  }

  goBack() {
    this.router.navigate(['menu/inscripciones']);
  }

  save() {
    console.log('func::save');
    this.service.saveInscripcion(this.inscripcion).subscribe(
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
    this.service.updateInscripcion(this.inscripcion).subscribe(
      data => {
        console.log('ok');
        this.inscripcion = data;
        this.router.navigate(['menu/inscripciones']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
