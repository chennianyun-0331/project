package Test3.Answer06;

/**
 * @Author: cny
 * @Date: 2020/4/15 17:34
 */
interface Shape2D{
    double PI = 3.14;
    public void grith();
    public void area();
}

class Circle implements Shape2D{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void grith(){
        double gridth = 2 * PI * radius;
        System.out.println("圆的周长"+gridth);
    }

    @Override
    public void area(){
        double area = radius * radius *PI;
        System.out.println("圆的面积"+area);
    }
}

class Rectangle implements Shape2D{
    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getBottm() {
        return width;
    }

    public void setBottm(double bottm) {
        this.width = bottm;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void grith(){
        double gridth = (width + height) * 2;
        System.out.println("长方形的周长"+gridth);
    }

    @Override
    public void area(){
        double area = width * height;
        System.out.println("长方形的面积"+area);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        c.area();
        c.grith();
        Rectangle r = new Rectangle(2.0,3.0);
        r.area();
        r.grith();
    }
}
