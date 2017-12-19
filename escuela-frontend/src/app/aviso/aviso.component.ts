import { Component, OnInit } from '@angular/core';
import { Aviso } from './aviso-model';
import { AvisoService } from './aviso.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-aviso',
  templateUrl: './aviso.component.html',
  styleUrls: ['./aviso.component.css']
})
export class AvisoComponent implements OnInit {

  avisos: Aviso[];
  selectedAviso: Aviso = new Aviso();

  constructor(private service: AvisoService,  private router: Router) { }

  ngOnInit() {
    this.service.getAvisos().subscribe(data => this.avisos = data);
  }

  // onSelect(aviso: Aviso): void {
  //   this.selectedAviso = aviso;
  // }

  goCreate(): void {
    this.router.navigate(['/menu/aviso-detail']);
  }

  goEdit(aviso: Aviso): void {
    this.router.navigate(['/menu/aviso-detail', aviso.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-aviso']);
  }

  delete(aviso: Aviso) {
    this.service.deleteAviso(aviso.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}
