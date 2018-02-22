import { Component, OnInit } from '@angular/core';
import { MateriaService } from './materia.service';
import { Router } from '@angular/router';
import { Materia } from './materia-models';

@Component({
  selector: 'app-materia',
  templateUrl: './materia.component.html',
  styleUrls: ['./materia.component.css']
})
export class MateriaComponent implements OnInit {

  materias: Materia [];

  constructor(private service: MateriaService,  private router: Router) { }

  ngOnInit() {
    this.service.getMaterias().subscribe( data => this.materias = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/materia-detail']);
  }

  goEdit(materia: Materia): void {
    console.log(materia.id);
    this.router.navigate(['/menu/materia-detail', materia.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-definicion']);
  }

  delete(materia: Materia) {
    this.service.deleteMateria(materia.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}

