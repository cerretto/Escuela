import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Alumno } from '../alumno.model';
import { Persona } from '../../persona/persona-models';
import { AlumnoService } from '../alumno.service';

@Component({
  selector: 'app-alumno-detail',
  templateUrl: './alumno-detail.component.html',
  styleUrls: ['./alumno-detail.component.css']
})
export class AlumnoDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  alumno: Alumno = new Alumno();
  personaCombo: Persona[];

  constructor(
    private service: AlumnoService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getAlumno(+params['id']).subscribe(
          alumno => {
            this.alumno = alumno;
            this.service.getPersonas().subscribe(
              data => {
                this.personaCombo = data;
                this.alumno.persona = this.personaCombo.filter(r => r.id === this.alumno.persona.id)[0];
              });
        });
      } else {
        this.service.getPersonas().subscribe(
          data => {
            this.personaCombo = data;
          });
      }
    });
  }

  goBack() {
    this.router.navigate(['menu/alumnos']);
  }

  save() {
    this.service.saveAlumno(this.alumno).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/alumnos']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updateAlumno(this.alumno).subscribe(
      data => {
        console.log('ok');
        this.alumno = data;
        this.router.navigate(['menu/alumnos']);
      }, err => {
        console.log('error');
      }
    );
  }

}


