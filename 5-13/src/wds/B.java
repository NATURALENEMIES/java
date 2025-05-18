package wds;

interface Shape {
	double size();
}

class Rectangle implements Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double size() {
		return length * width;
	}
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double size() {
		return Math.PI * radius * radius;
	}
}

class Cylinder implements Shape {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double size() {
		return Math.PI * radius * radius * height;
	}
}

public class B {
	public static void main(String[] args) {
		Shape[] shapes = { new Rectangle(3, 4), new Circle(2), new Cylinder(2, 5) };

		for (Shape shape : shapes) {
			System.out.println(shape.size());
		}
	}
}
