import { Component, OnInit } from '@angular/core';
import { NivelService } from './nivel.service';
import { Router } from '@angular/router';
import { Nivel } from './nivel-models';

@Component({
  selector: 'app-nivel',
  templateUrl: './nivel.component.html',
  styleUrls: ['./nivel.component.css']
})
export class NivelComponent implements OnInit {

  niveles: Nivel[];

  constructor(private service: NivelService,  private router: Router) { }

  ngOnInit() {
    this.service.getNiveles().subscribe( data => this.niveles = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/nivel-detail']);
  }

  goEdit(nivel: Nivel): void {
    this.router.navigate(['/menu/nivel-detail', nivel.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-definicion']);
  }

  delete(nivel: Nivel) {
    this.service.deleteNivel(nivel.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
