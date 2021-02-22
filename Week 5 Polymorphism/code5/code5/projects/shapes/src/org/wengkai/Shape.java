package org.wengkai;

public abstract class Shape {
    public void move(int dx, int dy) {
        center_x += dx;
        center_y += dy;
    }
    abstract public void render();
    private int center_x;
    private int center_y;
}
