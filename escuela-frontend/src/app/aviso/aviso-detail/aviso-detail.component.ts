import { Component, OnInit } from '@angular/core';
import { Aviso, TipoAviso } from '../aviso-model';
import { AvisoService } from '../aviso.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-aviso-detail',
  templateUrl: './aviso-detail.component.html',
  styleUrls: ['./aviso-detail.component.css']
})
export class AvisoDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  aviso: Aviso = new Aviso();
  tipoAvisoCombo: TipoAviso[];

  constructor(private service: AvisoService,
                private route: ActivatedRoute,
                private router: Router) { }

  ngOnInit() {

    // this.route.paramMap
    // .switchMap((params: ParamMap) => this.service.getAviso(+params.get('id')))
    // .subscribe(aviso => this.aviso = aviso);
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getAviso(+params['id']).subscribe(
          aviso => {
            this.aviso = aviso;

            this.service.getTipoAviso().subscribe(
              data => {
                this.tipoAvisoCombo = data;
                this.aviso.tipoAviso = this.tipoAvisoCombo.filter(r => r.id === this.aviso.tipoAviso.id)[0];
              });
          });

      } else {
        this.service.getTipoAviso().subscribe(
          data => {
            this.tipoAvisoCombo = data;
          });
      }
    });

  }

  goBack() {
    this.router.navigate(['menu/avisos']);
  }

  save() {
    console.log('func::save');
    this.service.saveAviso(this.aviso).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/avisos']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateAviso(this.aviso).subscribe(
      data => {
        console.log('ok');
        this.aviso = data;
        this.router.navigate(['menu/avisos']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
