package agent.dongtai.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//必须实现invocationhandler接口
public class mysellhandler implements InvocationHandler {
    private Object target=null;
    public mysellhandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res=null;
        //float price=factory.sell(amount);
        res=method.invoke(target,args);
        //price=price+25;//中间商赚差价
        if (res!=null){
            float price=(Float)res;
            price =price+25;
            res=price;
        }
        System.out.println("返回一个优惠劵。。。");
        return res;

    }
}
