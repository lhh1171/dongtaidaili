package agent.jingtai;
import agent.jingtai.shangjia.*;

public class shopmain {
    public static void main(String[] args) {
        taobao taobao=new taobao();
        float  price=taobao.sell(1);
        System.out.println("通过商家购买U盘的价格"+price);
    }
}
