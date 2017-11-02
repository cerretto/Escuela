import { Component, OnInit } from '@angular/core';
import { Aviso } from "./aviso-model";
import { AvisoService } from "./aviso.service";
import { Router } from "@angular/router";

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
    this.service.getAvisos().subscribe(data => this.avisos=data);
  }

  // onSelect(aviso: Aviso): void {
  //   this.selectedAviso = aviso;
  // }

  gotoDetail(aviso: Aviso): void {
    this.router.navigate(['/aviso-detail', aviso.id]);
  }

}
