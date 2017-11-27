import { Nivel } from '../nivel/nivel-models';

export class Plan {
    id: Number;
    codigo: String;
    descripcion: String;
    anio: String;
    niveles: Nivel[];
}
