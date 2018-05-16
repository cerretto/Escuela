import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from './persona-models';

@Injectable()
export class PersonaService {

  constructor(private http: HttpClient) { }

  getPersonas() {
    return this.http.get<Persona[]>("http://localhost:8081/personas");
  }

  getPersona(id: Number) {
    return this.http.get<Persona>("http://localhost:8081/personas/" + id);
  }

  deletePersona(id: Number) {
    return this.http.delete("http://localhost:8081/personas/" + id);
  }

  savePersona(persona: Persona) {
    return this.http.post<Persona>("http://localhost:8081/personas", persona);
  }

  updatePersona(persona: Persona) {
    return this.http.put<Persona>("http://localhost:8081/personas/"+ persona.id, persona);
  }

  getResponsable() {
    return this.http.get<Persona[]>("http://localhost:8081/personas");
  }

}