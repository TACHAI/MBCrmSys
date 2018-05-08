package com.mbcrmsys.common;

import redis.clients.jedis.Jedis;

/**
 * Created by @Author tachai
 * date 2018/4/25 21:19
 *
 * @Email 1206966083@qq.com
 */
public class RedisPool {
    //实际上没有用这种方法，是用的配置文件
    private static Jedis pool;//jedis链接池
    private static Integer maxIotal=20;//最大连接数
    private static Integer maxIdel =10;//在jedispool中最大的idle状态（空闲）的jedis实例的个数
    private static Integer minIdel =2;//在jedispool中最小的idle状态（空闲）的jedis实例的个数
    private static Boolean testOnBorrow=true;//在borrow一个jedis实例的时候，是否要进行验证操作，如果赋值为true，则是一个可用的实例
    private static Boolean testOnReturn=true;//在borrow一个jedis实例的时候，是否要进行验证操作，如果赋值为true，则是一个可用的实例
}
