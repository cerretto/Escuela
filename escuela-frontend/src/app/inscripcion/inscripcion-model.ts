import { Curso } from "../curso/curso-models";
import { Alumno } from "../alumno/alumno.model";
import { Materia } from "../materia/materia-models";

export class AlumnoCurso {
    id: number;
    curso: Curso;
    alumno: Alumno;
    anio: number;
    notas: Nota[];
}

export class Nota {
    id: number;
    calificacion: string;
    fecha: Date;
    evaluacion: Evaluacion;
}

export class Evaluacion {
    id: number;
    descripcion: string;
    materia: Materia;
}