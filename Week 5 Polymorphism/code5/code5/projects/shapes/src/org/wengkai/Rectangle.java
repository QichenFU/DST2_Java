package org.wengkai;

public class Rectangle extends Shape {
    private int width;
    private int height;

    @Override
    public void render() {
        System.out.println("Rectangel.render");
    }
}
