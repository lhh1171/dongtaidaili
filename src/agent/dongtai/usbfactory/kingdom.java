package agent.dongtai.usbfactory;

import agent.dongtai.service.usbshell;

public class kingdom implements usbshell {

    @Override
    public float sell(int amount) {
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
