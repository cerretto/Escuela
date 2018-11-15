import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { Evaluacion } from '../../evaluacion/evaluacion-model';
import { CargarNotasService } from '../cargar-notas-service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-cargar-notas-detail',
  templateUrl: './cargar-notas-detail.component.html',
  styleUrls: ['./cargar-notas-detail.component.css']
})
export class CargarNotasDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  evaluacion: Evaluacion = new Evaluacion();
  form: FormGroup;
  backendError: boolean = false;
  backendErrorMessage: string;

  constructor(private service: CargarNotasService,private route: ActivatedRoute,private router: Router,private fb: FormBuilder) { 
    this.createForm();
  }
  
  ngOnInit() {
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getEvaluacion(+params['id']).subscribe(
          data => {
            this.evaluacion = data; 
          });

      } else {
        
      }
    });
  }

  createForm() {
    this.form = this.fb.group({
      descripcion: new FormControl('', [Validators.required]),
      materia: new FormControl('', [Validators.required])
    })
  }

  goBack() {
    this.router.navigate(['/menu/cargar-notas']);
  }

  // save() {
  //   console.log('func::save');
  //   const formModel = this.form.value;
  //   this.evaluacion.materia = formModel.materia;
  //   this.service.saveEvaluacion(this.evaluacion).subscribe(
  //     data => {
  //       console.log('ok');
  //       this.router.navigate(['/menu/evaluaciones']);
  //     }, err => {
  //       var errorObj: RestError;
  //       try {
  //         errorObj = JSON.parse(err.error) as RestError;
  //       } catch (e) {
  //         errorObj = err.error as RestError;
  //       }

  //       this.backendError = true;
  //       if (errorObj !== null) {
  //         this.backendErrorMessage = errorObj.errors[0];
  //       } else {
  //         this.backendErrorMessage = 'Se produjo un error inesperado. Consulte al administrador.';
  //       }
  //     }
  //   );
  // }

}

