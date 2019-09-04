package com.easysite.exam.common.exception.user;

import com.easysite.exam.common.exception.user.UserException;

/**
 * 验证码错误异常类
 *
 * @author ruoyi
 */
public class CaptchaException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }
}
