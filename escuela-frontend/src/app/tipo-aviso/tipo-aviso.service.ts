import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TipoAviso } from './tipo-aviso-models';
import { environment } from '../../environments/environment';

@Injectable()
export class TipoAvisoService {

  endpoint = environment.apiurl;

  constructor(private http: HttpClient) { }

  getTipoAvisos() {
    return this.http.get<TipoAviso[]>(this.endpoint + "/tipoaviso");
  }

  getTipoAviso(id: Number) {
    return this.http.get<TipoAviso>(this.endpoint + "/tipoaviso/" + id);
  }

  deleteTipoAviso(id: Number) {
    return this.http.delete(this.endpoint + "/tipoaviso/" + id);
  }

  saveTipoAviso(tipoaviso: TipoAviso) {
    return this.http.post<TipoAviso>(this.endpoint + "/tipoaviso", tipoaviso);
  }

  updateTipoAviso(tipoaviso: TipoAviso) {
    return this.http.put<TipoAviso>(this.endpoint + "/tipoaviso/"+ tipoaviso.id, tipoaviso);
  }

}