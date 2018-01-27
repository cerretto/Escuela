import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TipoAviso } from './tipo-aviso-models';

@Injectable()
export class TipoAvisoService {

  constructor(private http: HttpClient) { }

  getTipoAvisos() {
    return this.http.get<TipoAviso[]>("http://localhost:8081/tipo-avisos");
  }

  getTipoAviso(id: Number) {
    return this.http.get<TipoAviso>("http://localhost:8081/tipo-aviso/" + id);
  }

  deleteTipoAviso(id: Number) {
    return this.http.delete("http://localhost:8081/tipo-aviso/" + id);
  }

  saveTipoAviso(tipoaviso: TipoAviso) {
    return this.http.post<TipoAviso>("http://localhost:8081/avisos", tipoaviso);
  }

  updateTipoAviso(tipoaviso: TipoAviso) {
    return this.http.put<TipoAviso>("http://localhost:8081/avisos/"+ tipoaviso.id, tipoaviso);
  }

}