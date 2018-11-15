import { Component, OnInit, Inject } from '@angular/core';
import { Materia } from '../materia/materia-models';
import { Evaluacion } from '../evaluacion/evaluacion-model';
import { Router } from '@angular/router';
import { CargarNotasService } from './cargar-notas-service';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material';
import { JwtHelperService } from '@auth0/angular-jwt';
import { UserSession } from '../security/auth-model';

@Component({
  selector: 'app-cargar-notas',
  templateUrl: './cargar-notas.component.html',
  styleUrls: ['./cargar-notas.component.css']
})
export class CargarNotasComponent implements OnInit {

  evaluacionCombo: Evaluacion[];
  materiaCombo: Materia[];
  panelOpenState = false;
  user: UserSession = new UserSession();

  constructor(private service: CargarNotasService,  private router: Router, public dialog: MatDialog) { }

  // TAL VEZ TENGA QUE PROGRAMAR UNA FUNCION EN PARTICULAR PARA CARGAR LAS EVALUACIONES DE CADA MATERIA QUE SELECCIONE

  ngOnInit() {
    let token = localStorage.getItem('token');
    let helper = new JwtHelperService();
    let pepito = helper.decodeToken(token);
    this.user.username = pepito.sub;
    this.service.getMaterias(this.user.username).subscribe(data => {
      this.materiaCombo = data;
    });
  }

  goCreate(): void {
    //this.router.navigate(['/menu/evaluacion-detail']);
  }

  goEdit(evaluacion: Evaluacion): void {
    this.router.navigate(['/menu/cargar-notas-detail', evaluacion.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-cursado']);
  }

  // delete(evaluacion: Evaluacion) {
  //   this.service.deleteEvaluacion(evaluacion.id).subscribe(
  //     data => {
  //       console.log('exito');
  //       this.ngOnInit();
  //     }, err => {
  //       console.log('error');
  //     }
  //   );
  // }

  onView(row: any): void {
    this.service.getEvaluacion(row.id).subscribe(
      data => {
        const dialogRef = this.dialog.open(DialogPruebaDialog, {
          width: '75%',
          //data: {nombreAlumno: row.alumno.persona.nombre, apellidoAlumno: row.alumno.persona.apellido, notas: data }
        });
    
        dialogRef.afterClosed().subscribe(result => {
          
        });
    });
  }

  llenarComboEvaluaciones(idMateria: number) {
    this.service.getEvaluaciones(idMateria).subscribe(data => {this.evaluacionCombo = data });
  }

}

@Component({
  selector: 'dialog-overview-example-dialog',
  templateUrl: 'prueba.html',
})
export class DialogPruebaDialog {
  
  constructor(
    public dialogRef: MatDialogRef<DialogPruebaDialog>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {}

  onNoClick(): void {
    this.dialogRef.close();
  }

}

export interface DialogData {
  nombreAlumno: string;
  apellidoAlumno: string;
}




 

  