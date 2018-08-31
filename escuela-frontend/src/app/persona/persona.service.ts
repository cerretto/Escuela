import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from './persona-models';
import { environment } from '../../environments/environment';

@Injectable()
export class PersonaService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getPersonas() {
    return this.http.get<Persona[]>(this.endpoint + "/personas");
  }

  getPersona(id: Number) {
    return this.http.get<Persona>(this.endpoint + "/personas/" + id);
  }

  deletePersona(id: Number) {
    return this.http.delete(this.endpoint + "/personas/" + id);
  }

  savePersona(persona: Persona) {
    return this.http.post<Persona>(this.endpoint + "/personas", persona);
  }

  updatePersona(persona: Persona) {
    return this.http.put<Persona>(this.endpoint + "/personas/"+ persona.id, persona);
  }

  getResponsable() {
    return this.http.get<Persona[]>(this.endpoint + "/personas");
  }

}