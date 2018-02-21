import { Component, OnInit } from '@angular/core';
import { Curso } from './curso-models';
import { CursoService } from './curso.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {

  cursos: Curso[];

  constructor(private service: CursoService,  private router: Router) { }

  ngOnInit() {
    this.service.getCursos().subscribe( data => this.cursos = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/curso-detail']);
  }

  goEdit(curso: Curso): void {
    this.router.navigate(['/menu/curso-detail', curso.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-definicion']);
  }

  delete(curso: Curso) {
    this.service.deleteCurso(curso.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
