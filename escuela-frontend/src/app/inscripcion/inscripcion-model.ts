import { Curso } from "../curso/curso-models";
import { Alumno } from "../alumno/alumno.model";

export class Inscripcion {
    id: Number;
    descripcion: String;
    curso: Curso;
    alumno: Alumno;
    fecha: Date;
}

