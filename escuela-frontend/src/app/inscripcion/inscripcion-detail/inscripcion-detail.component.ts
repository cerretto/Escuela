import { Component, OnInit } from '@angular/core';
import { AlumnoCurso } from '../inscripcion-model';
import { InscripcionService } from '../inscripcion.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';
import { Curso } from '../../curso/curso-models';
import { Alumno } from '../../alumno/alumno.model';
import { FormControl, Validators, FormGroup, FormBuilder} from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { RestError } from '../../shared/components/global-error-handler/rest-error';

@Component({
  selector: 'app-inscripcion-detail',
  templateUrl: './inscripcion-detail.component.html',
  styleUrls: ['./inscripcion-detail.component.css']
})
export class InscripcionDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  alumnoCurso: AlumnoCurso = new AlumnoCurso();
  form: FormGroup;
  cursoCombo: Curso[];
  alumnoCombo: Alumno[];
  backendError: boolean = false;
  backendErrorMessage: string;
  anios: number[] = [2018,2019,2020,2021];
  selected: Alumno;

  constructor(private service: InscripcionService,
    private route: ActivatedRoute,
    private router: Router,
    private fb: FormBuilder) { 
      this.createForm();
    }

  createForm() {
    this.form = this.fb.group({
      alumno: new FormControl('', [Validators.required]),
      curso: new FormControl('', [Validators.required]),
      anio: new FormControl('', [Validators.required])
    })
  }
    
  ngOnInit() {

    this.route.params.subscribe(params => {
      if (+params['id']) {
        console.log(+params['id']);
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
                this.selected = this.alumnoCurso.alumno;
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
    const formModel = this.form.value;
    this.alumnoCurso.alumno = formModel.alumno;
    this.alumnoCurso.curso = formModel.curso;
    this.alumnoCurso.anio = formModel.anio;
    this.service.saveInscripcion(this.alumnoCurso).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/inscripciones']);
      }, (err: HttpErrorResponse) => {
        var errorObj: RestError;
        try {
          errorObj = JSON.parse(err.error) as RestError;
        } catch (e) {
          errorObj = err.error as RestError;
        }

        this.backendError = true;
        console.log(errorObj);
        if (errorObj !== null) {
          this.backendErrorMessage = errorObj.errors[0];
        } else {
          this.backendErrorMessage = 'Se produjo un error inesperado. Consulte al administrador.';
        }
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
