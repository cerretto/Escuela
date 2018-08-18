import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ComisionService } from './comision.service';
import { Curso } from '../curso/curso-models';

@Component({
  selector: 'app-comision',
  templateUrl: './comision.component.html',
  styleUrls: ['./comision.component.css']
})
export class ComisionComponent implements OnInit {

  cursoCombo: Curso[];

  constructor(private service: ComisionService,  private router: Router) { }

  ngOnInit() {
    this.service.getCursos().subscribe(data => {this.cursoCombo = data; });
  }

  goEdit(curso: Curso): void {
    this.router.navigate(['/menu/comision-detail', curso]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-cursado']);
  }

}
