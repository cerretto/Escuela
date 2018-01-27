import { Component, OnInit } from '@angular/core';
import { TipoAviso } from './tipo-aviso-models';
import { TipoAvisoService } from './tipo-aviso.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-tipo-aviso',
  templateUrl: './tipo-aviso.component.html',
  styleUrls: ['./tipo-aviso.component.css']
})
export class TipoAvisoComponent implements OnInit {

  tipoavisos: TipoAviso[];

  constructor(private service: TipoAvisoService,  private router: Router) { }

  ngOnInit() {
    this.service.getTipoAvisos().subscribe(data => this.tipoavisos = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/tipo-aviso-detail']);
  }

  goEdit(tipoaviso: TipoAviso): void {
    this.router.navigate(['/menu/tipo-aviso-detail', tipoaviso.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-aviso']);
  }

  delete(tipoaviso: TipoAviso) {
    this.service.deleteTipoAviso(tipoaviso.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
