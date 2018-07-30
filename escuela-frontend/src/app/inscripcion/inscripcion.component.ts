import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { InscripcionService } from './inscripcion.service';
import { AlumnoCurso } from './inscripcion-model';
import {MatSelectModule} from '@angular/material/select';

@Component({
  selector: 'app-inscripcion',
  templateUrl: './inscripcion.component.html',
  styleUrls: ['./inscripcion.component.css']
})
export class InscripcionComponent implements OnInit {

  alumnoCursoCombo: AlumnoCurso[];
  selectedInscripcion: AlumnoCurso = new AlumnoCurso();

  constructor(private service: InscripcionService,  private router: Router) { }

  ngOnInit() {
    this.service.getInscripciones().subscribe(data => {this.alumnoCursoCombo = data; console.log(this.alumnoCursoCombo)});
  }

  goCreate(): void {
    this.router.navigate(['/menu/inscripcion-detail']);
  }

  goEdit(alumnoCurso: AlumnoCurso): void {
    this.router.navigate(['/menu/inscripcion-detail', alumnoCurso.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-cursado']);
  }

  delete(alumnoCurso: AlumnoCurso) {
    this.service.deleteInscripcion(alumnoCurso.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
