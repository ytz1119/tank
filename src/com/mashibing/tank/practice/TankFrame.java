package com.mashibing.tank.practice;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    int x=200, y = 200;
    Dir dir = Dir.DOWN;
    final static int SPEED = 10;
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
        g.fillRect(x,y,50,50);
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
//        x += 10;
//        y += 10;
    }

    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        private void move() {
            if (bL) {
                x -= 10;
            }
            if (bR) {
                x += 10;
            }
            if (bU) {
                y -= 10;
            }
            if (bD) {
                y += 10;
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    move();
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    move();
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    move();
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    move();
                    break;
                default:
                    break;
            }
            System.out.println("key press");
//            x += 200;
//            repaint();
            setMainTankDir();
        }

        private void setMainTankDir() {
            if (bL) dir = Dir.LEFT;
            if (bR) dir = Dir.RIGHT;
            if (bD) dir = Dir.DOWN;
            if (bU) dir = Dir.UP;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_LEFT:
                        bL = false;
                        move();
                        break;
                    case KeyEvent.VK_UP:
                        bU = false;
                        move();
                        break;
                    case KeyEvent.VK_RIGHT:
                        bR = false;
                        move();
                        break;
                    case KeyEvent.VK_DOWN:
                        bD = false;
                        move();
                        break;
                    default:
                        break;
                }
            setMainTankDir();
        }
    }

}
