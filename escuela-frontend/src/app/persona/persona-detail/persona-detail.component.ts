import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../persona.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Persona } from '../persona-models';

@Component({
  selector: 'app-persona-detail',
  templateUrl: './persona-detail.component.html',
  styleUrls: ['./persona-detail.component.css']
})
export class PersonaDetailComponent implements OnInit {

  updateFlag: Boolean = false;
  persona: Persona = new Persona();
  responsableCombo: Persona[];

  constructor(
    private service: PersonaService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      if (+params['id']) {
        // console.log(+params['id']);
        this.updateFlag = true;
        this.service.getPersona(+params['id']).subscribe(
          persona => {
            console.log(persona.nombre);
            this.persona = persona;
            console.log(this.persona);
            this.service.getResponsable().subscribe(
              data => {
                this.responsableCombo = data;
                this.persona.responsable = this.responsableCombo.filter(r => r.id === this.persona.responsable.id)[0];
              });
        });
      } else {
        this.service.getResponsable().subscribe(
          data => {
            this.responsableCombo = data;
          });
      }
    });
  }

  goBack() {
    this.router.navigate(['menu/personas']);
  }

  save() {
    console.log('func::save');
    console.log(this.persona);
    this.service.savePersona(this.persona).subscribe(
      data => {
        console.log('ok');
        this.router.navigate(['menu/personas']);
      }, err => {
        console.log('err');
      }
    );
  }

  update() {
    console.log('func::update');
    this.service.updatePersona(this.persona).subscribe(
      data => {
        console.log('ok');
        this.persona = data;
        this.router.navigate(['menu/personas']);
      }, err => {
        console.log('ok');
      }
    );
  }

}


