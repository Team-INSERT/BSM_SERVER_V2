package bssm.bsm.global.error;

import lombok.Getter;

@Getter
public class HttpErrorResponse {

    private final int statusCode;
    private final String message;

    public HttpErrorResponse(HttpException httpError) {
        this.statusCode = httpError.getStatusCode();
        this.message = httpError.getMessage();
    }
}
