import { Component, OnInit } from '@angular/core';
import { RolService } from '../rol.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Rol } from '../rol-models';

@Component({
  selector: 'app-rol-detail',
  templateUrl: './rol-detail.component.html',
  styleUrls: ['./rol-detail.component.css']
})
export class RolDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  rol: Rol = new Rol();

  constructor(
    private service: RolService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getRol(+params['id']).subscribe(
          rol => {
            this.rol = rol;
          });
      }
    });
  }

  goBack() {
    this.router.navigate(['menu/roles']);
  }

  save() {
    console.log('func::save');
    this.service.saveRol(this.rol).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/roles']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateRol(this.rol).subscribe(
      data => {
        console.log('ok');
        this.rol = data;
        this.router.navigate(['menu/roles']);
      }, err => {
        console.log('ok');
      }
    );
  }

}


