import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AvisoComponent } from './aviso/aviso.component';
import { MenuComponent } from './menu/menu.component';
import { AvisoDetailComponent } from './aviso/aviso-detail/aviso-detail.component';
import { PlanComponent } from './plan/plan.component';
import { NivelComponent } from './nivel/nivel.component';
import { PlanDetailComponent } from './plan/plan-detail/plan-detail.component';
import { NivelDetailComponent } from './nivel/nivel-detail/nivel-detail.component';
import { CursoComponent } from './curso/curso.component';
import { CursoDetailComponent } from './curso/curso-detail/curso-detail.component';


const routes: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'menu',     component: MenuComponent,
        children: [
          { path: 'avisos',  component: AvisoComponent },
          { path: 'aviso-detail', component: AvisoDetailComponent },
          { path: 'aviso-detail/:id', component: AvisoDetailComponent },
          { path: 'planes',  component: PlanComponent },
          { path: 'plan-detail', component: PlanDetailComponent },
          { path: 'plan-detail/:id', component: PlanDetailComponent },
          { path: 'niveles',  component: NivelComponent },
          { path: 'nivel-detail', component: NivelDetailComponent },
          { path: 'nivel-detail/:id', component: NivelDetailComponent },
          { path: 'cursos',  component: CursoComponent },
          { path: 'curso-detail', component: CursoDetailComponent },
          { path: 'curso-detail/:id', component: CursoDetailComponent },
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
