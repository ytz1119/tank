package com.mashibing.tank.practice;

import java.awt.*;

public class Bullet {
    private static final int SPEED = 10;
    private static int WIDTH = 10, HEIGHT = 10;

    private int x, y;
    private Dir dir;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics graphics) {
        Color c = graphics.getColor();
        graphics.setColor(Color.RED);
        graphics.fillOval(x, y, WIDTH, HEIGHT);
        graphics.setColor(c);
        move();
    }

    private void move() {
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
    }

}
