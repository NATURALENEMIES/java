package B2;

// Circle.java - 圆类实现
class Circle implements Shape {
private double radius;

public Circle(double radius) {
this.radius = radius;
}
@Override
public double size() {
return Math.PI * radius * radius; // 圆面积
}
}