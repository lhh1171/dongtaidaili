package agent.dongtai;

import agent.dongtai.handler.mysellhandler;
import agent.dongtai.service.usbshell;
import agent.dongtai.usbfactory.kingdom;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class mainshop {
    public static void main(String[] args) {
        //1.创建目标对象
        usbshell factory=new kingdom();
        //2,创建invocationhandler对象
        InvocationHandler handler=new mysellhandler(factory);
        //3,创建代理对象
        usbshell proxy=(usbshell)Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),handler);
        //4,通过代理实现方法，不用实现淘宝类,直接通过proxy实现
        float price= proxy.sell(1);
        System.out.println("通过动态代理，调用方法："+price);
    }
}
