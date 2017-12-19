import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AvisoComponent } from './aviso/aviso.component';
import { MenuComponent } from './menu/menu.component';
import { AvisoDetailComponent } from './aviso/aviso-detail/aviso-detail.component';
import { PlanComponent } from './plan/plan.component';
import { NivelComponent } from './nivel/nivel.component';
import { MenuAvisoComponent } from './menu/menu-aviso/menu-aviso.component';


const routes: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'menu',     component: MenuComponent, 
        children: [
          { path: 'menu-aviso', component: MenuAvisoComponent},
          { path: 'avisos',  component: AvisoComponent },
          { path: 'aviso-detail', component: AvisoDetailComponent },
          { path: 'aviso-detail/:id', component: AvisoDetailComponent },
          { path: 'planes',  component: PlanComponent },
          { path: 'plan-detail', component: PlanComponent },
          { path: 'plan-detail/:id', component: PlanComponent },
          { path: 'niveles',  component: NivelComponent },
          { path: 'nivel-detail', component: NivelComponent },
          { path: 'nivel-detail/:id', component: NivelComponent },
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
