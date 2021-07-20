package nz.co.doctorS.DoctorS.model;

import lombok.Getter;

@Getter
public enum ResultCode {

    /*
     * 1000 failed
     * 2000 partial success
     * 2001 success
     * 1*** specific error information
     */
    FAILED(400, "Failed"),
    PARTIAL_SUCCESS(201, "Partial success"),
    SUCCESS(200, "Success"),

    PROCESS_ERROR(410, "Process error."),

    INNER_ERROR(490, "Inner error.");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
