package com.mbcrmsys.common;

import com.mbcrmsys.pojo.Consumer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by @Author tachai
 * date 2018/4/26 22:17
 *
 * @Email 1206966083@qq.com
 */
@Aspect
public class IsLoginAop {
    @Pointcut("execution(* com.mbcrmsys.controller.*.*(..))")
    private void anyMethod(){};//定义一个切入点

    @Before("anyMethod()")
    public void doAccessCheck(JoinPoint call){
        String clazz=call.getTarget().getClass().getName();
        //获取目标对象上正在执行的方法名
        String methodName=call.getSignature().getName();
        System.out.println("前置通知:" + clazz + "类的" + methodName + "方法开始了...");
        System.out.println("前置通知");
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        HttpSession session =request.getSession();
        Consumer user=(Consumer)session.getAttribute(Const.CURRENT_USER);
        if(user==null){

        }
//        System.out.println();
    }

    @AfterReturning("anyMethod()")
    public void doAfter(){
        System.out.println("后置通知");
    }


    @AfterThrowing("anyMethod()")
    public void doAfterThrow(){
        System.out.println("例外通知");
    }

//    @Around("anyMethod()")
//    public Object doBasicProfiling(ProceedingJoinPointpjp) throws Throwable{
//        System.out.println("进入环绕通知");
//        Object object = pjp.proceed();//执行该方法
//        System.out.println("退出方法");
//        return object;
//    }
}
