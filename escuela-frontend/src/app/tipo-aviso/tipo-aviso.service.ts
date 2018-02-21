import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TipoAviso } from './tipo-aviso-models';

@Injectable()
export class TipoAvisoService {

  constructor(private http: HttpClient) { }

  getTipoAvisos() {
    return this.http.get<TipoAviso[]>("http://localhost:8081/tipoaviso");
  }

  getTipoAviso(id: Number) {
    return this.http.get<TipoAviso>("http://localhost:8081/tipoaviso/" + id);
  }

  deleteTipoAviso(id: Number) {
    return this.http.delete("http://localhost:8081/tipoaviso/" + id);
  }

  saveTipoAviso(tipoaviso: TipoAviso) {
    return this.http.post<TipoAviso>("http://localhost:8081/tipoaviso", tipoaviso);
  }

  updateTipoAviso(tipoaviso: TipoAviso) {
    return this.http.put<TipoAviso>("http://localhost:8081/tipoaviso/"+ tipoaviso.id, tipoaviso);
  }

}