package com.mbcrmsys.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by @Author tachai
 * date 2018/3/5 15:42
 *
 * @Email 1206966083@qq.com
 */
public class DecoderSelectByCondition {
    public static Map<String, String> decoder(String condition1,String condition2,String condition3){
        Map<String,String> map = new HashMap<String,String>();
        try {
            condition1 = URLDecoder.decode(condition1,"utf-8");
            condition2 =URLDecoder.decode(condition2,"utf-8");
            condition3 =URLDecoder.decode(condition3,"utf-8");
            map.put("param1",condition1);
            map.put("param2",condition2);
            map.put("param3",condition3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return map;
    }
}
