package com.company;

import java.awt.*;
import java.awt.event.InputEvent;

public class DynedClicker {
    public static void main(String[] args) {
        //findPosition();
        lessonClicker(4,6,2);
    }

    public static void lessonClicker(int times,int rep,int speak){
        System.out.println("Starting in 5 secs");
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        AutoClicker ac = new AutoClicker();
        System.out.println("Started");
        for (int i = 0; i < times ; i++) {
            //Repeat
            ac.setDelay(9000);
            for (int j = 0; j < rep; j++) {
                ac.setMousePosition(914,927);
                ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
            }

            //Speak and listening
            ac.setDelay(3000);
            for (int j = 0; j < speak; j++) {
                ac.setDelay(3000);
                ac.setMousePosition(627,931);
                ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
                ac.setDelay(5000);
                ac.setMousePosition(714,931);
                ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
            }

            //Final repeat
            ac.setDelay(9000);
            ac.setMousePosition(914,927);
            ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);

            //Next
            ac.setDelay(3000);
            ac.setMousePosition(992,936);
            ac.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
        }
        System.out.println("Ended");
    }



    public static void findPosition(){
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Starting");
        int i=1;
        while(i<=4) {
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            PointerInfo a = MouseInfo.getPointerInfo();
            int x = (int)a.getLocation().getX();
            int y = (int)a.getLocation().getY();
            System.out.println(i+": "+x + " " + y);
            i++;
        }
        System.out.println("Ended");
        /* NOTE THE POSITION HERE!
         * replay: 914, 927
         * speak: 627, 931
         * listen: 714, 931
         * next: 992, 936
         * */
    }
}
