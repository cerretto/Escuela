import { Injectable } from '@angular/core';
import { CanActivate, Router, CanActivateChild, ActivatedRouteSnapshot, RouterStateSnapshot, CanLoad, Route } from '@angular/router';
import { AuthService } from './auth.service';
import { JwtHelperService } from '@auth0/angular-jwt';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AuthGuard implements CanActivate {
    constructor(public auth: AuthService, public router: Router) { }

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {

        if (!this.auth.isAuthenticated()) {
            this.router.navigate(['/login']);
            return false;
        }

        if (route.routeConfig.path !== 'menu') {
            let token = localStorage.getItem('token');
            let helper = new JwtHelperService();
            let pepito = helper.decodeToken(token);

            if (pepito.auth[0].authority !== 'ADMIN') {
                this.router.navigate(['/login']);
                return false;
            }
        }

        return true;
    }

}
