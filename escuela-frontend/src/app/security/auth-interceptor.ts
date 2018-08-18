import { HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import 'rxjs/add/observable/empty';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

    constructor(private router: Router) { }

    intercept(req: HttpRequest<any>,
        next: HttpHandler): Observable<HttpEvent<any>> {

        const token = localStorage.getItem('token');
        if (token) {
            const cloned = req.clone({
                setHeaders: { Authorization: `Bearer ${token}` }
            });
            return next.handle(cloned)
                .catch(
                    error => {
                        if (error instanceof HttpErrorResponse &&
                            (error.status === 401 || error.status === 403)) {
                            this.router.navigate(['/login']);
                            return Observable.throw(error);
                        } else {
                            return Observable.throw(error);
                        }
                    });
        } else {
            return next.handle(req)
                .catch(
                    error => {
                        if (error instanceof HttpErrorResponse &&
                            (error.status === 401 || error.status === 403)) {
                            this.router.navigate(['/login']);
                            return Observable.throw(error);
                        } else {
                            return Observable.throw(error);
                        }
                    });
        }
    }

}
