package com.mbcrmsys.common;

/**
 * Created by @Author tachai
 * date 2018/2/23 15:57
 *
 * @Email 1206966083@qq.com
 */
public class   Const {
    public static final String CURRENT_USER="currentUser";
    public static final String EMAIL="email";
    public static final String USERNAME="username";

    public  interface  Role{
        int ROLE_CUSTOMER=0;//普通用户
        int ROLE_ADMIN=1;//管理员
    }
}
