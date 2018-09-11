import { Component, OnInit } from '@angular/core';
import { Evaluacion } from '../evaluacion-model';
import { Materia } from '../../materia/materia-models';
import { EvaluacionService } from '../evaluacion.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { RestError } from '../../shared/components/global-error-handler/rest-error';

@Component({
  selector: 'app-evaluacion-detail',
  templateUrl: './evaluacion-detail.component.html',
  styleUrls: ['./evaluacion-detail.component.css']
})
export class EvaluacionDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  evaluacion: Evaluacion = new Evaluacion();
  materiaCombo: Materia[];
  form: FormGroup;
  backendError: boolean = false;
  backendErrorMessage: string;

  constructor(private service: EvaluacionService,private route: ActivatedRoute,private router: Router,private fb: FormBuilder) { 
    this.createForm();
  }
              
  createForm() {
    this.form = this.fb.group({
      descripcion: new FormControl('', [Validators.required]),
      materia: new FormControl('', [Validators.required])
    })
  }

  ngOnInit() {

    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getEvaluacion(+params['id']).subscribe(
          data => {
            this.evaluacion = data;

            this.service.getMaterias().subscribe(
              data => {
                this.materiaCombo = data;
                this.evaluacion.materia = this.materiaCombo.filter(r => r.id === this.evaluacion.materia.id)[0];
              });
          });

      } else {
        this.service.getMaterias().subscribe(
          data => {
            this.materiaCombo = data;
          });
      }
    });

  }

  goBack() {
    this.router.navigate(['/menu/evaluaciones']);
  }

  save() {
    console.log('func::save');
    const formModel = this.form.value;
    this.evaluacion.materia = formModel.materia;
    this.service.saveEvaluacion(this.evaluacion).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['/menu/evaluaciones']);
      }, err => {
        var errorObj: RestError;
        try {
          errorObj = JSON.parse(err.error) as RestError;
        } catch (e) {
          errorObj = err.error as RestError;
        }

        this.backendError = true;
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
    this.service.updateEvaluacion(this.evaluacion).subscribe(
      data => {
        console.log('ok');
        this.evaluacion = data;
        this.router.navigate(['/menu/evaluaciones']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
