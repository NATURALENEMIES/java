package B2;

class Rectangle implements Shape {
private double length;
private double width;

public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

@Override
public double size() {
return length * width; // ¾ØÐÎÃæ»ý
}
}
