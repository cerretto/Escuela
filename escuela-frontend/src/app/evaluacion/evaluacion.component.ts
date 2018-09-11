import { Component, OnInit } from '@angular/core';
import { EvaluacionService } from './evaluacion.service';
import { Router } from '@angular/router';
import { Evaluacion } from './evaluacion-model';

@Component({
  selector: 'app-evaluacion',
  templateUrl: './evaluacion.component.html',
  styleUrls: ['./evaluacion.component.css']
})
export class EvaluacionComponent implements OnInit {

  evaluacionCombo: Evaluacion[];

  constructor(private service: EvaluacionService,  private router: Router) { }

  ngOnInit() {
    this.service.getEvaluaciones().subscribe(data => {this.evaluacionCombo = data });
  }

  goCreate(): void {
    this.router.navigate(['/menu/evaluacion-detail']);
  }

  goEdit(evaluacion: Evaluacion): void {
    this.router.navigate(['/menu/evaluacion-detail', evaluacion.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-cursado']);
  }

  delete(evaluacion: Evaluacion) {
    this.service.deleteEvaluacion(evaluacion.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
