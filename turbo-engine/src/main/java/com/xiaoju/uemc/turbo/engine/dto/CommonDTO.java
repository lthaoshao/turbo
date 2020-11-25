package com.xiaoju.uemc.turbo.engine.dto;


import com.xiaoju.uemc.turbo.engine.common.ErrorEnum;
import lombok.Data;

/**
 * Created by Stefanie on 2019/12/8.
 */
@Data
public class CommonDTO {

    private int errCode;
    private String errMsg;

    public CommonDTO() {
        super();
    }

    public CommonDTO(ErrorEnum errorEnum) {
        this.errCode = errorEnum.getErrNo();
        this.errMsg = errorEnum.getErrMsg();
    }
}
