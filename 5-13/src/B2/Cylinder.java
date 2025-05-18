package B2;

// Cylinder.java - 圆柱体类实现
class Cylinder implements Shape {
private double radius;
private double height;

public Cylinder(double radius, double height) {
this.radius = radius;
this.height = height;
}

@Override
public double size() {
return Math.PI * radius * radius * height; // 圆柱体体积
}
}
