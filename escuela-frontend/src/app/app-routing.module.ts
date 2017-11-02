import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AvisoComponent }   from './aviso/aviso.component';
import { MenuComponent } from "./menu/menu.component";
import { AvisoDetailComponent } from "./aviso/aviso-detail/aviso-detail.component";


const routes: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'menu',     component: MenuComponent },
    { path: 'avisos',  component: AvisoComponent },
    { path: 'aviso-detail/:id', component: AvisoDetailComponent },
//   { path: 'heroes',     component: HeroesComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
