package com.company;

import java.awt.*;

public class AutoClicker {
    private Robot robot;
    private int delay;

    public AutoClicker(){
        try{
            robot = new Robot();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        delay = 300;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void clickMouse(int button){
        try{
            robot.mousePress(button);
            robot.delay(50);
            robot.mouseRelease(button);
            robot.delay(delay);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
