package com.mbcrmsys.util;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;

import javax.servlet.http.HttpSession;

/**
 * Created by @Author tachai
 * date 2018/2/28 22:33
 *
 * @Email 1206966083@qq.com
 */
public class CheckLogin {
    public static ServerResponse<String> check(HttpSession session){
        Consumer user=(Consumer) session.getAttribute(Const.CURRENT_USER)                   ;
        if(user==null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }else {
            return null;
        }
    }
}
