package com.mashibing.tank.practice;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    int x=200, y = 200;
    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("Tank war");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        this.addKeyListener(new MyKeyListener());
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x,y,50,50);
//        x += 10;
//        y += 10;
    }

    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;


        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            System.out.println("key press");
//            x += 200;
//            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_LEFT:
                        bL = false;
                        break;
                    case KeyEvent.VK_UP:
                        bU = false;
                        break;
                    case KeyEvent.VK_RIGHT:
                        bR = false;
                        break;
                    case KeyEvent.VK_DOWN:
                        bD = false;
                        break;
                    default:
                        break;
                }
        }
    }

}
