package com.luokangtao.common.entity;

/**
 * 返回码
 * @author luokangtao
 * @create 2019-07-14 21:30
 */
public interface StatusCode {
    int OK = 20000;//成功
    int ERROR = 20001;//失败
    int LOGINERROR = 20002;//用户名或密码错误
    int ACCESSERROR = 20003;//权限不足
    int REMOTEERROR = 20004;//远程调用失败
    int REPERROR = 20005;//重复操作
}
