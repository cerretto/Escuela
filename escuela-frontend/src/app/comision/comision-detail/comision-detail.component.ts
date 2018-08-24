import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';
import { Curso } from '../../curso/curso-models';
import { FormControl, Validators, FormGroup, FormBuilder} from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { RestError } from '../../shared/components/global-error-handler/rest-error';
import { ComisionService } from '../comision.service';
import { AlumnoCurso } from '../../inscripcion/inscripcion-model';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';

export interface DialogData {
  animal: string;
  nombreAlumno: string;
  apellidoAlumno: string;
}

@Component({
  selector: 'app-comision-detail',
  templateUrl: './comision-detail.component.html'
})
export class ComisionDetailComponent implements OnInit {

  backendError: boolean = false;
  backendErrorMessage: string;
  comboAlumnoCurso: AlumnoCurso[];
  curso: Curso;

  constructor(private service: ComisionService,
    private route: ActivatedRoute,
    private router: Router,
    public dialog: MatDialog) { 
    
    }

  ngOnInit() {

    this.route.params.subscribe(params => {

      if (+params['id']) {
        this.service.getAlumnoCurso(+params['id']).subscribe(
          data => {
            this.comboAlumnoCurso = data;
        });
        
        this.service.getCurso(+params['id']).subscribe(
          data => {
            this.curso = data;
        });

      } else {
      }
    });

  }

  goBack() {
    this.router.navigate(['menu/comisiones']);
  }

  reloadTable() {
    this.ngOnInit();
  }

  onView(row: AlumnoCurso): void {
    const dialogRef = this.dialog.open(DialogOverviewExampleDialog, {
      width: '75%',
      data: {nombreAlumno: row.alumno.persona.nombre, apellidoAlumno: row.alumno.persona.apellido }
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      
    });
  }

}

@Component({
  selector: 'dialog-overview-example-dialog',
  templateUrl: 'notas.html',
})
export class DialogOverviewExampleDialog {

  constructor(
    public dialogRef: MatDialogRef<DialogOverviewExampleDialog>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {}

  onNoClick(): void {
    this.dialogRef.close();
  }

}