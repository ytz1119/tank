package com.mashibing.tank.practice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewFrame {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
        while (true) {
            Thread.sleep(50);
            tankFrame.repaint();
        }
//        Frame frame = new Frame();
//        frame.setSize(800, 600);
//        frame.setResizable(false);
//        frame.setTitle("Tank war");
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        frame.setVisible(true);
    }

}
