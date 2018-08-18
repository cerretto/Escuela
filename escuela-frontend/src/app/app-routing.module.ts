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
import { AuthGuardService as AuthGuard } from './security/auth-guard.service';
import { TipoAvisoDetailComponent } from './tipo-aviso/tipo-aviso-detail/tipo-aviso-detail.component';
import { TipoAvisoComponent } from './tipo-aviso/tipo-aviso.component';
import { UsuarioDetailComponent } from './usuario/usuario-detail/usuario-detail.component';
import { UsuarioComponent } from './usuario/usuario.component';

const routes: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'login', component: LoginComponent },
    { path: 'menu',     component: MenuComponent, canActivate: [AuthGuard],
        children: [
          { path: 'menu-aviso', component: MenuAvisoComponent},
          { path: 'avisos',  component: AvisoComponent },
          { path: 'aviso-detail', component: AvisoDetailComponent },
          { path: 'aviso-detail/:id', component: AvisoDetailComponent },
          { path: 'planes',  component: PlanComponent },
          { path: 'plan-detail', component: PlanDetailComponent },
          { path: 'plan-detail/:id', component: PlanDetailComponent },
          { path: 'niveles',  component: NivelComponent },
          { path: 'nivel-detail', component: NivelDetailComponent },
          { path: 'nivel-detail/:id', component: NivelDetailComponent },
          { path: 'tipo-aviso', component: TipoAvisoComponent },
          { path: 'tipo-aviso-detail', component: TipoAvisoDetailComponent },
          { path: 'tipo-aviso-detail/:id', component: TipoAvisoDetailComponent },
          { path: 'cursos',  component: CursoComponent },
          { path: 'curso-detail', component: CursoDetailComponent },
          { path: 'curso-detail/:id', component: CursoDetailComponent },
          { path: 'menu-definicion', component: MenuDefinicionComponent },
          { path: 'materias', component: MateriaComponent },
          { path: 'materia-detail', component: MateriaDetailComponent },
          { path: 'materia-detail/:id', component: MateriaDetailComponent },
          { path: 'menu-cursado', component: MenuCursadoComponent },
          { path: 'inscripciones', component: InscripcionComponent },
          { path: 'inscripcion-detail', component: InscripcionDetailComponent },
          { path: 'inscripcion-detail/:id', component: InscripcionDetailComponent },
          { path: 'menu-administracion', component: MenuAdministracionComponent },
          { path: 'usuarios', component: UsuarioComponent },
          { path: 'usuario-detail', component: UsuarioDetailComponent },
          { path: 'usuario-detail/:id', component: UsuarioDetailComponent },
          { path: 'personas', component: PersonaComponent },
          { path: 'persona-detail', component: PersonaDetailComponent },
          { path: 'persona-detail/:id', component: PersonaDetailComponent },
          { path: 'roles', component: RolComponent },
          { path: 'rol-detail', component: RolDetailComponent },
          { path: 'rol-detail/:id', component: RolDetailComponent },
          { path: 'alumnos', component: AlumnoComponent },
          { path: 'alumno-detail', component: AlumnoDetailComponent },
          { path: 'alumno-detail/:id', component: AlumnoDetailComponent },
          { path: 'comisiones', component: ComisionComponent },
          { path: 'comision-detail', component: ComisionDetailComponent },
          { path: 'comision-detail/:id', component: ComisionDetailComponent }
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
