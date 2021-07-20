package nz.co.doctors.exception;

import lombok.extern.slf4j.Slf4j;
import nz.co.doctors.model.ResultCode;
import nz.co.doctors.model.ResultVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class BusinessExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResultVO<String> businessExceptionHandler(BusinessException ex) {
        log.error(ex.getMessage(), ex);
        return new ResultVO<>(ResultCode.FAILED, ex.getData());
    }

}
