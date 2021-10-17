package agent.jingtai.factoryk;

import agent.jingtai.service.usbshell;

public class kingdom implements usbshell {
//不接受用户的单独，只卖给商家
   @Override
   public float sell(int amount) {
       return 85;
   }
}
