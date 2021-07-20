package nz.co.doctors.exception;

import lombok.Getter;
import nz.co.doctors.model.ResultCode;
import org.apache.commons.lang3.StringUtils;

import java.text.MessageFormat;

@Getter
public class BusinessException extends Exception {

    private int code;
    private String msg;
    private Object[] msgParams;

    public BusinessException(Exception exception) {
        super(exception);
    }

    public BusinessException(ResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMessage());
    }

    public BusinessException(ResultCode resultCode, Object... msgParams) {
        this(resultCode.getCode(), resultCode.getMessage(), msgParams);
    }

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(int code, String msg, Object... msgParams) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.msgParams = msgParams;
    }

    public String getData() {
        if(StringUtils.isNotBlank(getMsg())){
            if(msgParams != null && msgParams.length>0){
                if (msg.contains("{")) {
                    return MessageFormat.format(msg, msgParams);
                } else {
                    return msgParams[0].toString();
                }
            }
        }
        return "";
    }

}
