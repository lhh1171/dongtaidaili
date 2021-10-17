package agent.jingtai.shangjia;
import agent.jingtai.factoryk.*;
import agent.jingtai.service.usbshell;

public class taobao implements usbshell {
    private kingdom factory=new kingdom();
    @Override
    public float sell(int amount) {
        float price=factory.sell(amount);
        price=price+25;//中间商赚差价
        System.out.println("返回一个优惠劵。。。");
        return price;
    }
}
