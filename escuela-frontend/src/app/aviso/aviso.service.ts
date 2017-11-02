import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Aviso } from "./aviso-model";

@Injectable()
export class AvisoService {

  constructor(private http: HttpClient) { }

  getAvisos(){
    return this.http.get<Aviso[]>("http://localhost:8081/avisos/");
  }

  getAviso(id: Number){
    return this.http.get<Aviso>("http://localhost:8081/avisos/" + id);
  }

}
