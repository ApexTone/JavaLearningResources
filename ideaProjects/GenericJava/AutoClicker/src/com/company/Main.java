package com.company;

import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many click?: ");
        int clicks = s.nextInt();
        System.out.println("How long between each delay?: ");
        int delay = s.nextInt();

        AutoClicker ac = new AutoClicker();
        ac.setDelay(delay);

        System.out.println("Start in 3 sec");
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Process started");
        for(int i=0;i<clicks;i++){
            ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
        }
        System.out.println("Process ended");
    }
}
