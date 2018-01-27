import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AvisoComponent } from './aviso/aviso.component';
import { RouterModule } from '@angular/router';
import { AvisoService } from './aviso/aviso.service';
import { AppRoutingModule } from './app-routing.module';
import { MenuComponent } from './menu/menu.component';
import { AvisoDetailComponent } from './aviso/aviso-detail/aviso-detail.component';
import { NivelComponent } from './nivel/nivel.component';
import { PlanComponent } from './plan/plan.component';
import { PlanDetailComponent } from './plan/plan-detail/plan-detail.component';
import { NivelDetailComponent } from './nivel/nivel-detail/nivel-detail.component';
import { CursoComponent } from './curso/curso.component';
import { MenuAvisoComponent } from './menu/menu-aviso/menu-aviso.component';
import { CursoDetailComponent } from './curso/curso-detail/curso-detail.component';
import { PlanService } from './plan/plan.service';
import { NivelService } from './nivel/nivel.service';
import { CursoService } from './curso/curso.service';
import { TipoAvisoComponent } from './tipo-aviso/tipo-aviso.component';
import { TipoAvisoDetailComponent } from './tipo-aviso/tipo-aviso-detail/tipo-aviso-detail.component';
import { TipoAvisoService } from './tipo-aviso/tipo-aviso.service';


@NgModule({
  declarations: [
    AppComponent,
    AvisoComponent,
    MenuComponent,
    AvisoDetailComponent,
    NivelComponent,
    PlanComponent,
    PlanDetailComponent,
    NivelDetailComponent,
    CursoComponent,
    MenuAvisoComponent,
    CursoDetailComponent,
    TipoAvisoComponent,
    TipoAvisoDetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [
    AvisoService,
    PlanService,
    NivelService,
    CursoService,
    TipoAvisoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
