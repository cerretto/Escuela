import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlumnoDetailComponent } from './alumno/alumno-detail/alumno-detail.component';
import { AlumnoComponent } from './alumno/alumno.component';
import { AvisoDetailComponent } from './aviso/aviso-detail/aviso-detail.component';
import { AvisoComponent } from './aviso/aviso.component';
import { ComisionDetailComponent } from './comision/comision-detail/comision-detail.component';
import { ComisionComponent } from './comision/comision.component';
import { CursoDetailComponent } from './curso/curso-detail/curso-detail.component';
import { CursoComponent } from './curso/curso.component';
import { InscripcionDetailComponent } from './inscripcion/inscripcion-detail/inscripcion-detail.component';
import { InscripcionComponent } from './inscripcion/inscripcion.component';
import { LoginComponent } from './login/login.component';
import { MateriaDetailComponent } from './materia/materia-detail/materia-detail.component';
import { MateriaComponent } from './materia/materia.component';
import { MenuAdministracionComponent } from './menu/menu-administracion/menu-administracion.component';
import { MenuAvisoComponent } from './menu/menu-aviso/menu-aviso.component';
import { MenuCursadoComponent } from './menu/menu-cursado/menu-cursado.component';
import { MenuDefinicionComponent } from './menu/menu-definicion/menu-definicion.component';
import { MenuComponent } from './menu/menu.component';
import { NivelDetailComponent } from './nivel/nivel-detail/nivel-detail.component';
import { NivelComponent } from './nivel/nivel.component';
import { PersonaDetailComponent } from './persona/persona-detail/persona-detail.component';
import { PersonaComponent } from './persona/persona.component';
import { PlanDetailComponent } from './plan/plan-detail/plan-detail.component';
import { PlanComponent } from './plan/plan.component';
import { RolDetailComponent } from './rol/rol-detail/rol-detail.component';
import { RolComponent } from './rol/rol.component';
import { TipoAvisoDetailComponent } from './tipo-aviso/tipo-aviso-detail/tipo-aviso-detail.component';
import { TipoAvisoComponent } from './tipo-aviso/tipo-aviso.component';
import { UsuarioDetailComponent } from './usuario/usuario-detail/usuario-detail.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { AuthGuard } from './security/auth-guard.service';
import { EvaluacionComponent } from './evaluacion/evaluacion.component';
import { EvaluacionDetailComponent } from './evaluacion/evaluacion-detail/evaluacion-detail.component';

const routes: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'login', component: LoginComponent },
    { path: 'menu', component: MenuComponent, canActivate: [AuthGuard],
        children: [
          { path: 'menu-aviso', component: MenuAvisoComponent},
          { path: 'avisos',  component: AvisoComponent },
          { path: 'aviso-detail', component: AvisoDetailComponent },
          { path: 'aviso-detail/:id', component: AvisoDetailComponent },
          { path: 'planes',  component: PlanComponent, canActivate: [AuthGuard] },
          { path: 'plan-detail', component: PlanDetailComponent, canActivate: [AuthGuard] },
          { path: 'plan-detail/:id', component: PlanDetailComponent, canActivate: [AuthGuard] },
          { path: 'niveles',  component: NivelComponent, canActivate: [AuthGuard] },
          { path: 'nivel-detail', component: NivelDetailComponent, canActivate: [AuthGuard] },
          { path: 'nivel-detail/:id', component: NivelDetailComponent, canActivate: [AuthGuard] },
          { path: 'tipo-aviso', component: TipoAvisoComponent },
          { path: 'tipo-aviso-detail', component: TipoAvisoDetailComponent },
          { path: 'tipo-aviso-detail/:id', component: TipoAvisoDetailComponent },
          { path: 'cursos',  component: CursoComponent },
          { path: 'curso-detail', component: CursoDetailComponent, canActivate: [AuthGuard] },
          { path: 'curso-detail/:id', component: CursoDetailComponent, canActivate: [AuthGuard] },
          { path: 'menu-definicion', component: MenuDefinicionComponent, canActivate: [AuthGuard] },
          { path: 'materias', component: MateriaComponent, canActivate: [AuthGuard] },
          { path: 'materia-detail', component: MateriaDetailComponent, canActivate: [AuthGuard] },
          { path: 'materia-detail/:id', component: MateriaDetailComponent, canActivate: [AuthGuard] },
          { path: 'menu-cursado', component: MenuCursadoComponent },
          { path: 'inscripciones', component: InscripcionComponent },
          { path: 'inscripcion-detail', component: InscripcionDetailComponent },
          { path: 'inscripcion-detail/:id', component: InscripcionDetailComponent },
          { path: 'menu-administracion', component: MenuAdministracionComponent, canActivate: [AuthGuard] },
          { path: 'usuarios', component: UsuarioComponent,canActivate: [AuthGuard] },
          { path: 'usuario-detail', component: UsuarioDetailComponent, canActivate: [AuthGuard] },
          { path: 'usuario-detail/:id', component: UsuarioDetailComponent, canActivate: [AuthGuard] },
          { path: 'personas', component: PersonaComponent, canActivate: [AuthGuard] },
          { path: 'persona-detail', component: PersonaDetailComponent, canActivate: [AuthGuard] },
          { path: 'persona-detail/:id', component: PersonaDetailComponent, canActivate: [AuthGuard] },
          { path: 'roles', component: RolComponent, canActivate: [AuthGuard] },
          { path: 'rol-detail', component: RolDetailComponent, canActivate: [AuthGuard] },
          { path: 'rol-detail/:id', component: RolDetailComponent, canActivate: [AuthGuard] },
          { path: 'alumnos', component: AlumnoComponent, canActivate: [AuthGuard] },
          { path: 'alumno-detail', component: AlumnoDetailComponent, canActivate: [AuthGuard] },
          { path: 'alumno-detail/:id', component: AlumnoDetailComponent, canActivate: [AuthGuard] },
          { path: 'comisiones', component: ComisionComponent },
          { path: 'comision-detail', component: ComisionDetailComponent },
          { path: 'comision-detail/:id', component: ComisionDetailComponent },
          { path: 'evaluaciones', component: EvaluacionComponent },
          { path: 'evaluacion-detail', component: EvaluacionDetailComponent },
          { path: 'evaluacion-detail/:id', component: EvaluacionDetailComponent }
        ]
    },
    // redireccion (debe quedar al final de los routing)
    { path: '**', redirectTo: '/menu', pathMatch: 'full' },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
