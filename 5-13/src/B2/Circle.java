package B2;

// Circle.java - Բ��ʵ��
class Circle implements Shape {
private double radius;

public Circle(double radius) {
this.radius = radius;
}
@Override
public double size() {
return Math.PI * radius * radius; // Բ���
}
}