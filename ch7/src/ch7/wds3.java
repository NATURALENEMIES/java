package ch7;

class Circle {
    private double radius;
    // ���캯�������ڳ�ʼ��Բ�İ뾶
    public Circle(double radius) {
        this.radius = radius;
    }
    // ��ǰԲ�����
    public double area() {
        return Math.PI * radius * radius;
    }
    // ��뾶Ϊr��Բ�����
    public static double area(double r) {
        return Math.PI * r * r;
    }
    // �����ָ��Բ�����
    public static double area(Circle c) {
        return Math.PI * c.radius * c.radius;
    }
}
public class wds3 {
    public static void main(String[] args) {
        // ����һ���뾶Ϊ5��Բ����
        Circle circle = new Circle(5);
        // ����public double area()
        double area1 = circle.area();
        System.out.println("��ǰԲ���뾶Ϊ5�������: " + area1);
        // ����public static double area(double r)
        double area2 = Circle.area(3);
        System.out.println("�뾶Ϊ3��Բ�����: " + area2);
        // ����public static double area(Circle c)
        double area3 = Circle.area(circle);
        System.out.println("����ָ��Բ���뾶Ϊ5�������: " + area3);
    }
}