import { Component, OnInit } from '@angular/core';
import { TipoAviso } from '../tipo-aviso-models';
import { TipoAvisoService } from '../tipo-aviso.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-tipo-aviso-detail',
  templateUrl: './tipo-aviso-detail.component.html',
  styleUrls: ['./tipo-aviso-detail.component.css']
})
export class TipoAvisoDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  tipoAviso: TipoAviso = new TipoAviso();

  constructor(private service: TipoAvisoService,
              private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      if (+params['id']) {
        this.updateFlag = true;
        this.service.getTipoAviso(+params['id']).subscribe(
          tipoAviso => {
            this.tipoAviso = tipoAviso;
          });

      }
    });
  }

  goBack() {
    this.router.navigate(['menu/tipo-aviso']);
  }

  save() {
    console.log('func::save');
    this.service.saveTipoAviso(this.tipoAviso).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/tipo-aviso']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateTipoAviso(this.tipoAviso).subscribe(
      data => {
        console.log('ok');
        this.tipoAviso = data;
        this.router.navigate(['menu/tipo-aviso']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
