import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Aviso, TipoAviso } from './aviso-model';

@Injectable()
export class AvisoService {

  constructor(private http: HttpClient) { }

  getAvisos() {
    return this.http.get<Aviso[]>("http://localhost:8081/avisos");
  }

  getAviso(id: Number) {
    return this.http.get<Aviso>("http://localhost:8081/avisos/" + id);
  }

  deleteAviso(id: Number) {
    return this.http.delete("http://localhost:8081/avisos/" + id);
  }

  saveAviso(aviso: Aviso) {
    return this.http.post<Aviso>("http://localhost:8081/avisos", aviso);
  }

  updateAviso(aviso: Aviso) {
    return this.http.put<Aviso>("http://localhost:8081/avisos/"+ aviso.id, aviso);
  }

  getTipoAviso() {
    return this.http.get<TipoAviso[]>("http://localhost:8081/tipoaviso");
  }

}
