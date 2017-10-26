import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AvisoComponent } from "./aviso/aviso.component";
import { RouterModule }   from '@angular/router';
import { AvisoService } from "./aviso/aviso.service";





@NgModule({
  declarations: [
    AppComponent,
    AvisoComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: 'aviso',
        component: AvisoComponent
      }
    ])
   
  ],
  providers: [
    AvisoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
