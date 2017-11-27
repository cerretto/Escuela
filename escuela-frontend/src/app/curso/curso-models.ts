import { Nivel } from '../nivel/nivel-models';

export class Curso {
    id: Number;
    codigo: String;
    descripcion: String;
    cupo: Number;
    anioCalendario: Number;
    nivel: Nivel;
}
