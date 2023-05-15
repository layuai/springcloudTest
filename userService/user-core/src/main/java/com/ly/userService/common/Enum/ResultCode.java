package com.ly.userService.common.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author LY
 * @Title: com.ly.orderService.common.Enum
 * @Description: 描述
 * @date 2023/5/12 16:09
 */
@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(20000, "成功"),
    FAILURE(5000, "失败"),
    PROGRAM_INSIDE_EXCEPTION(50001, "程序内部异常"),
    REQUEST_PARAM_ERROR(50002, "请求参数错误");

    private final Integer code;
    private final String message;
}
