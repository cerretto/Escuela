import { HttpErrorResponse } from '@angular/common/http';
import { ErrorHandler, Injectable } from '@angular/core';

@Injectable()
export class MyErrorHandler implements ErrorHandler {

  handleError(error: Error | HttpErrorResponse) {
    if (error instanceof HttpErrorResponse) {
      // Server or connection error happened
      if (!navigator.onLine) {
        // Handle offline error
      } else {
        // Handle Http Error (error.status === 403, 404...)
        if (error.status === 401) {
          // const message = new alert();
          // alert.call('', 'Unauthorized');
        } else if (error.status === 403) {
          // alert.call('', 'Forbidden');
        }
      }
    } else {
      // Handle Client Error (Angular Error, ReferenceError...)
    }
    // Log the error anyway
    console.error('It happens: ', error);
  }
}
