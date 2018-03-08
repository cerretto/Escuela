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
import { MenuDefinicionComponent } from './menu/menu-definicion/menu-definicion.component';
import { MateriaComponent } from './materia/materia.component';
import { MateriaDetailComponent } from './materia/materia-detail/materia-detail.component';
import { MateriaService } from './materia/materia.service';
import { MenuCursadoComponent } from './menu/menu-cursado/menu-cursado.component';
import { InscripcionComponent } from './inscripcion/inscripcion.component';
import { InscripcionDetailComponent } from './inscripcion/inscripcion-detail/inscripcion-detail.component';
import { InscripcionService } from './inscripcion/inscripcion.service';


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
    TipoAvisoDetailComponent,
    MenuDefinicionComponent,
    MateriaComponent,
    MateriaDetailComponent,
    MenuCursadoComponent,
    InscripcionComponent,
    InscripcionDetailComponent
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
    TipoAvisoService,
    MateriaService,
    InscripcionService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
