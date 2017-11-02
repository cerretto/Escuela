import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AvisoComponent } from "./aviso/aviso.component";
import { RouterModule }   from '@angular/router';
import { AvisoService } from "./aviso/aviso.service";
import { AppRoutingModule } from "./app-routing.module";
import { MenuComponent } from './menu/menu.component';
import { AvisoDetailComponent } from './aviso/aviso-detail/aviso-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    AvisoComponent,
    MenuComponent,
    AvisoDetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
   
  ],
  providers: [
    AvisoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
