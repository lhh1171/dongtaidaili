package cg;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lqc
 */
public class Aop {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(IBusinessImpl.class);
        enhancer.setCallback(new LogIntercept());
        IBusiness business = (IBusiness) enhancer.create();
        business.doSomething();
    }

    public static class LogIntercept implements MethodInterceptor {
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            Object rev = methodProxy.invokeSuper(o, objects);
            if (method.getName().equals("doSomething")) {
                System.out.println("this is invoke doSomething");
            }
            return rev;
        }
    }
}
