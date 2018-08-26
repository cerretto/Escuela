import { Persona } from "../persona/persona-models";

export class Usuario {
    id: Number;
    usr: String;
    password: String;
    fechaInscripcion: Date;
    persona: Persona;
}
