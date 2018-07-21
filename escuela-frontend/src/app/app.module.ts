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
import { MenuAdministracionComponent } from './menu/menu-administracion/menu-administracion.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { UsuarioService } from './usuario/usuario.service';
import { UsuarioDetailComponent } from './usuario/usuario-detail/usuario-detail.component';
import { PersonaComponent } from './persona/persona.component';
import { PersonaDetailComponent } from './persona/persona-detail/persona-detail.component';
import { RolComponent } from './rol/rol.component';
import { RolDetailComponent } from './rol/rol-detail/rol-detail.component';
import { PersonaService } from './persona/persona.service';
import { RolService } from './rol/rol.service';
import { AlumnoComponent } from './alumno/alumno.component';
import { AlumnoService } from './alumno/alumno.service';
import { AlumnoDetailComponent } from './alumno/alumno-detail/alumno-detail.component';
import { MatSelectModule } from '@angular/material/select';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
// import { SharedModule } from './shared/shared.module';

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
    InscripcionDetailComponent,
    MenuAdministracionComponent,
    UsuarioComponent,
    UsuarioDetailComponent,
    PersonaComponent,
    PersonaDetailComponent,
    RolComponent,
    RolDetailComponent,
    AlumnoComponent,
    AlumnoDetailComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    MatSelectModule,
    BrowserAnimationsModule
    // SharedModule
  ],
  // exports: [ SharedModule ],
  providers: [
    AvisoService,
    PlanService,
    NivelService,
    CursoService,
    TipoAvisoService,
    MateriaService,
    InscripcionService,
    UsuarioService,
    PersonaService,
    RolService,
    AlumnoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
