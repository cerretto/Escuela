import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ErrorHandler, NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatSelectModule } from '@angular/material/select';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AlumnoDetailComponent } from './alumno/alumno-detail/alumno-detail.component';
import { AlumnoComponent } from './alumno/alumno.component';
import { AlumnoService } from './alumno/alumno.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AvisoDetailComponent } from './aviso/aviso-detail/aviso-detail.component';
import { AvisoComponent } from './aviso/aviso.component';
import { AvisoService } from './aviso/aviso.service';
import { ComisionDetailComponent, DialogOverviewExampleDialog } from './comision/comision-detail/comision-detail.component';
import { ComisionComponent } from './comision/comision.component';
import { ComisionService } from './comision/comision.service';
import { CursoDetailComponent } from './curso/curso-detail/curso-detail.component';
import { CursoComponent } from './curso/curso.component';
import { CursoService } from './curso/curso.service';
import { InscripcionDetailComponent } from './inscripcion/inscripcion-detail/inscripcion-detail.component';
import { InscripcionComponent } from './inscripcion/inscripcion.component';
import { InscripcionService } from './inscripcion/inscripcion.service';
import { LoginComponent } from './login/login.component';
import { MateriaDetailComponent } from './materia/materia-detail/materia-detail.component';
import { MateriaComponent } from './materia/materia.component';
import { MateriaService } from './materia/materia.service';
import { MenuAdministracionComponent } from './menu/menu-administracion/menu-administracion.component';
import { MenuAvisoComponent } from './menu/menu-aviso/menu-aviso.component';
import { MenuCursadoComponent } from './menu/menu-cursado/menu-cursado.component';
import { MenuDefinicionComponent } from './menu/menu-definicion/menu-definicion.component';
import { MenuComponent } from './menu/menu.component';
import { NivelDetailComponent } from './nivel/nivel-detail/nivel-detail.component';
import { NivelComponent } from './nivel/nivel.component';
import { NivelService } from './nivel/nivel.service';
import { PersonaDetailComponent } from './persona/persona-detail/persona-detail.component';
import { PersonaComponent } from './persona/persona.component';
import { PersonaService } from './persona/persona.service';
import { PlanDetailComponent } from './plan/plan-detail/plan-detail.component';
import { PlanComponent } from './plan/plan.component';
import { PlanService } from './plan/plan.service';
import { RolDetailComponent } from './rol/rol-detail/rol-detail.component';
import { RolComponent } from './rol/rol.component';
import { RolService } from './rol/rol.service';
import { AuthInterceptor } from './security/auth-interceptor';
import { MyErrorHandler } from './shared/components/global-error-handler/my-error-handler';
import { TipoAvisoDetailComponent } from './tipo-aviso/tipo-aviso-detail/tipo-aviso-detail.component';
import { TipoAvisoComponent } from './tipo-aviso/tipo-aviso.component';
import { TipoAvisoService } from './tipo-aviso/tipo-aviso.service';
import { UsuarioDetailComponent } from './usuario/usuario-detail/usuario-detail.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { UsuarioService } from './usuario/usuario.service';
import { MatDialog, MatDialogModule, MatButtonModule, MatInputModule, MatExpansionModule } from '@angular/material';
import { AuthGuard } from './security/auth-guard.service';
import { AuthService } from './security/auth.service';
import { EvaluacionComponent } from './evaluacion/evaluacion.component';
import { EvaluacionDetailComponent } from './evaluacion/evaluacion-detail/evaluacion-detail.component';
import { EvaluacionService } from './evaluacion/evaluacion.service';
import { CargarNotasComponent, DialogPruebaDialog } from './cargar-notas/cargar-notas.component';
import { CargarNotasService } from './cargar-notas/cargar-notas-service';
import { CargarNotasDetailComponent } from './cargar-notas/cargar-notas-detail/cargar-notas-detail.component';
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
    AlumnoDetailComponent,
    LoginComponent,
    ComisionComponent,
    ComisionDetailComponent,
    DialogOverviewExampleDialog,
    EvaluacionComponent,
    EvaluacionDetailComponent,
    CargarNotasComponent,
    CargarNotasDetailComponent,
    DialogPruebaDialog
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    MatSelectModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatDialogModule,
    MatButtonModule,
    MatInputModule,
    MatExpansionModule
    // SharedModule
  ],
  entryComponents: [
    DialogOverviewExampleDialog,
    DialogPruebaDialog
  ],
  exports: [ ],
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
    AlumnoService,
    EvaluacionService,
    CargarNotasService,
    AuthService,
    AuthGuard,
    {
      provide: ErrorHandler,
      useClass: MyErrorHandler,
    },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    },
    ComisionService,
    MatDialog
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
