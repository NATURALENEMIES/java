
public class triangle {
	private double a;
	private double b;
	private double c;

	public triangle (double a, double b, double c) {
	if (!isValid(a, b, c)) {
	throw new IllegalArgumentException("�޷�����������");
	}
	this.a = a;
	this.b = b;
	this.c = c;
	}

	private boolean isValid(double a, double b, double c) {
	return a > 0 && b > 0 && c > 0
	&& a + b > c
	&& a + c > b
	&& b + c > a;
	}

	public double getPerimeter() {
	return a + b + c;
	}

	public double getArea() {
	double s = getPerimeter() / 2;
	return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static void main(String[] args) {
		triangle t1 = new triangle(3, 4, 5);
	System.out.println("������1:");
	System.out.println("�ܳ�: " + t1.getPerimeter());
	System.out.println("���: " + t1.getArea());

	triangle t2 = new  triangle(7, 8, 9);
	System.out.println("\n������2:");
	System.out.println("�ܳ�: " + t2.getPerimeter());
	System.out.println("���: " + t2.getArea());
	}
	}