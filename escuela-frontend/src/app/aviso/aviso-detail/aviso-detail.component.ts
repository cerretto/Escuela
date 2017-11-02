import { Component, OnInit } from '@angular/core';
import { Aviso } from "../aviso-model";
import { AvisoService } from "../aviso.service";
import { ActivatedRoute, ParamMap } from "@angular/router";
import { Location }                 from '@angular/common';
import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-aviso-detail',
  templateUrl: './aviso-detail.component.html',
  styleUrls: ['./aviso-detail.component.css']
})
export class AvisoDetailComponent implements OnInit {

  aviso: Aviso;

  constructor(private service: AvisoService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap
    .switchMap((params: ParamMap) => this.service.getAviso(+params.get('id')))
    .subscribe(aviso => this.aviso = aviso);
  }

}
