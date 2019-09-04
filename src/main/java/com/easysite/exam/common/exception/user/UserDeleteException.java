package com.easysite.exam.common.exception.user;

import com.easysite.exam.common.exception.user.UserException;

/**
 * 用户账号已被删除
 *
 * @author ruoyi
 */
public class UserDeleteException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserDeleteException()
    {
        super("user.password.delete", null);
    }
}
