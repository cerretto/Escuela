import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AlumnoService } from './alumno.service';
import { Alumno } from './alumno.model';

@Component({
  selector: 'app-alumno',
  templateUrl: './alumno.component.html',
  styleUrls: ['./alumno.component.css']
})
export class AlumnoComponent implements OnInit {

  alumnos: Alumno[];
  selectedAlumno: Alumno = new Alumno();

  constructor(private service: AlumnoService,  private router: Router) { }

  ngOnInit() {
    this.service.getAlumnos().subscribe(data => this.alumnos = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/alumno-detail']);
  }

  goEdit(alumno: Alumno): void {
    this.router.navigate(['/menu/alumno-detail', alumno.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-administracion']);
  }

  delete(alumno: Alumno) {
    this.service.deleteAlumno(alumno.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
