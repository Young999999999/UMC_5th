package UMC.spring.study.apiPayload.exception.handler;

import UMC.spring.study.apiPayload.code.BaseErrorCode;
import UMC.spring.study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
