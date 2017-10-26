import { Component, OnInit } from '@angular/core';
import { Aviso } from "./aviso-model";
import { AvisoService } from "./aviso.service";

@Component({
  selector: 'app-aviso',
  templateUrl: './aviso.component.html',
  styleUrls: ['./aviso.component.css']
})
export class AvisoComponent implements OnInit {

  avisos: Aviso[];

  constructor(private service: AvisoService) { }

  ngOnInit() {
    this.service.getAvisos().subscribe(data => this.avisos=data);
  }

}
