package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class FakePopup {
    Random r = new Random();
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//Get desktop resolution
    private final int width = (int)screenSize.getWidth();
    private final int height = (int)screenSize.getHeight();

    public FakePopup(){//Constructor
    }

    public void randomInput() throws AWTException {
        Robot rb = new Robot();//Bot for auto-click
        rb.keyPress(KeyEvent.VK_V);//Bot pressing random key for keyboard block
        rb.mouseMove(r.nextInt(width),r.nextInt(height));//Bot moving cursor to different places
    }

    public void popupWindow(){
        JWindow win = new JWindow();//Create empty box
        JLabel label = new JLabel("You got virus!", JLabel.CENTER);//Text to show in JWindow
        win.add(label);//Show text
        win.setSize(200,75);//Set box size
        win.setLocation(r.nextInt(width),r.nextInt(height));//Set box position
        win.setVisible(true);//Set box visibility
    }
}
