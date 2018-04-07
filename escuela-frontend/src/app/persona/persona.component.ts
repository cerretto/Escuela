import { Component, OnInit } from '@angular/core';
import { PersonaService } from './persona.service';
import { Router } from '@angular/router';
import { Persona } from './persona-models';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

  personas: Persona[];

  constructor(private service: PersonaService, private router: Router) { }

  ngOnInit() {
    this.service.getPersonas().subscribe( data => this.personas = data);
  }

  goCreate(): void {
    this.router.navigate(['/menu/persona-detail']);
  }

  goEdit(persona: Persona): void {
    this.router.navigate(['/menu/persona-detail', persona.id]);
  }

  goMenu() {
    this.router.navigate(['/menu/menu-administracion']);
  }

  delete(persona: Persona) {
    this.service.deletePersona(persona.id).subscribe(
      data => {
        console.log('exito');
        this.ngOnInit();
      }, err => {
        console.log('error');
      }
    );
  }

}



