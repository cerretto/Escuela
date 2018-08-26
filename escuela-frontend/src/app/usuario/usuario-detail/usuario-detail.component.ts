import { Component, OnInit } from '@angular/core';
import { Usuario } from '../usuario-models';
import { UsuarioService } from '../usuario.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';
import 'rxjs/add/operator/switchMap';
import { Persona } from '../../persona/persona-models';
//import { Persona } from '../../persona/persona-models';

@Component({
  selector: 'app-usuario-detail',
  templateUrl: './usuario-detail.component.html',
  styleUrls: ['./usuario-detail.component.css']
})
export class UsuarioDetailComponent implements OnInit {
  
  updateFlag: Boolean = false;
  usuario: Usuario = new Usuario();
  personaCombo: Persona[];

  constructor(private service: UsuarioService,
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
        this.service.getUsuario(+params['id']).subscribe(
          usuario => {
            this.usuario = usuario;

            // this.service.getPersona().subscribe(
            //   data => {
            //     this.personaCombo = data;
            //     this.usuario.persona = this.personaCombo.filter(r => r.id === this.usuario.persona.id)[0];
            //   });
            // this.service.getAlumno().subscribe(
            //   data => {
            //     this.alumnoCombo = data;
            //     this.inscripcion.alumno = this.alumnoCombo.filter(r => r.id === this.inscripcion.alumno.id)[0];
            //   });
          });

      } else {
        // this.service.getPersona().subscribe(
        //   data => {
        //     this.personaCombo = data;
        //   });
        // this.service.getAlumno().subscribe(
        //   data => {
        //     this.alumnoCombo = data;
        //   });
      }
    });

  }

  goBack() {
    this.router.navigate(['menu/usuarios']);
  }

  save() {
    console.log('func::save');
    this.service.saveUsuario(this.usuario).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/usuarios']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateUsuario(this.usuario).subscribe(
      data => {
        console.log('ok');
        this.usuario = data;
        this.router.navigate(['menu/usuarios']);
      }, err => {
        console.log('ok');
      }
    );
  }

}
