import { Component, OnInit } from '@angular/core';
import { Aviso } from "../aviso-model";
import { AvisoService } from "../aviso.service";
import { ActivatedRoute, ParamMap, Router } from "@angular/router";
import { Location }                 from '@angular/common';
import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-aviso-detail',
  templateUrl: './aviso-detail.component.html',
  styleUrls: ['./aviso-detail.component.css']
})
export class AvisoDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  aviso: Aviso = new Aviso();

  constructor(private service: AvisoService, 
                private route: ActivatedRoute, 
                private router: Router) { }

  ngOnInit() {

    // this.route.paramMap
    // .switchMap((params: ParamMap) => this.service.getAviso(+params.get('id')))
    // .subscribe(aviso => this.aviso = aviso);

    this.route.params.subscribe(params => {
      if(+params['id']) {
        console.log(+params['id']);
        this.updateFlag = true;
        this.service.getAviso(+params['id']).subscribe(
          aviso => this.aviso = aviso
        );
      } else {
        console.log("nada");
      }
    });

  }

  goBack(){
    this.router.navigate(['/avisos']);
  }

  save(){
    this.service.saveAviso(this.aviso).subscribe(
      data => {
        this.router.navigate(['/avisos']);
      }, err => {

      }
    );
  }

  update(){
    this.service.updateAviso(this.aviso).subscribe(
      data => {
        this.aviso = data;
      }, err => {

      }
    );
  }

}
