import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Aviso, TipoAviso } from './aviso-model';
import { environment } from '../../environments/environment';

@Injectable()
export class AvisoService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getAvisos() {
    return this.http.get<Aviso[]>(this.endpoint + "/avisos");
  }

  getAviso(id: Number) {
    return this.http.get<Aviso>(this.endpoint + "/avisos/" + id);
  }

  deleteAviso(id: Number) {
    return this.http.delete(this.endpoint + "/avisos/" + id);
  }

  saveAviso(aviso: Aviso) {
    return this.http.post<Aviso>(this.endpoint + "/avisos", aviso);
  }

  updateAviso(aviso: Aviso) {
    return this.http.put<Aviso>(this.endpoint + "/avisos/"+ aviso.id, aviso);
  }

  getTipoAviso() {
    return this.http.get<TipoAviso[]>(this.endpoint + "/tipoaviso");
  }

}
