export class RestError extends Error {
    httpStatusCode: string;
    code: string;
    errorCode: string;
    cause: string;
    validationErrors: ValidationError[];
    exception: string;
    errors: string[];
    // properties: Map̣<String,Object>;

    constructor(message?: string) {
        super(message);
        this.name = RestError.name;
        Object.setPrototypeOf(this, RestError.prototype);
    }
}

export class ValidationError {
    message: string;
}
