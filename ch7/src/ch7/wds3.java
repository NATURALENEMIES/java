package ch7;

class Circle {
    private double radius;
    // 构造函数，用于初始化圆的半径
    public Circle(double radius) {
        this.radius = radius;
    }
    // 求当前圆的面积
    public double area() {
        return Math.PI * radius * radius;
    }
    // 求半径为r的圆的面积
    public static double area(double r) {
        return Math.PI * r * r;
    }
    // 求参数指定圆的面积
    public static double area(Circle c) {
        return Math.PI * c.radius * c.radius;
    }
}
public class wds3 {
    public static void main(String[] args) {
        // 创建一个半径为5的圆对象
        Circle circle = new Circle(5);
        // 测试public double area()
        double area1 = circle.area();
        System.out.println("当前圆（半径为5）的面积: " + area1);
        // 测试public static double area(double r)
        double area2 = Circle.area(3);
        System.out.println("半径为3的圆的面积: " + area2);
        // 测试public static double area(Circle c)
        double area3 = Circle.area(circle);
        System.out.println("参数指定圆（半径为5）的面积: " + area3);
    }
}