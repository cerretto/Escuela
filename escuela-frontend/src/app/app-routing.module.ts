import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AvisoComponent }   from './aviso/aviso.component';
import { MenuComponent } from "./menu/menu.component";
import { AvisoDetailComponent } from "./aviso/aviso-detail/aviso-detail.component";


const routes: Routes = [
    { path: '', redirectTo: '/menu', pathMatch: 'full' },
    { path: 'menu',     component: MenuComponent },
    { path: 'avisos',  component: AvisoComponent },
    { path: 'aviso-detail', component: AvisoDetailComponent },
    { path: 'aviso-detail/:id', component: AvisoDetailComponent },
    
    //redireccion (debe quedar al final de los routing)
    { path: '**', redirectTo: '/menu', pathMatch: 'full' },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
