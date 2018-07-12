import { Curso } from "../curso/curso-models";
import { Alumno } from "../alumno/alumno.model";

export class AlumnoCurso {
    id: Number;
    curso: Curso;
    alumno: Alumno;
    anio: number;
}

