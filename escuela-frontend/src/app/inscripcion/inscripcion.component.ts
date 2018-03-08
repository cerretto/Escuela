import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Inscripcion } from './inscripcion-model';
import { InscripcionService } from './inscripcion.service';

@Component({
  selector: 'app-inscripcion',
  templateUrl: './inscripcion.component.html',
  styleUrls: ['./inscripcion.component.css']
})
export class InscripcionComponent implements OnInit {

  inscipciones: Inscripcion[];
  selectedInscripcion: Inscripcion = new Inscripcion();

  constructor(private service: InscripcionService,  private router: Router) { }

  ngOnInit() {
    this.service.getInscripciones().subscribe(data => this.inscipciones = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/inscripcion-detail']);
  }

  goEdit(inscripcion: Inscripcion): void {
    this.router.navigate(['/menu/inscripcion-detail', inscripcion.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-cursado']);
  }

  delete(inscripcion: Inscripcion) {
    this.service.deleteInscripcion(inscripcion.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
