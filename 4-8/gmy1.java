package ch1;

public class gmy1 {
		private double a;
		private double b;
		private double c;

		public gmy1 (double a, double b, double c) {
		if (!isValid(a, b, c)) {
		throw new IllegalArgumentException("无法构成三角形");
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
			 gmy1 t1 = new gmy1(3, 4, 5);
		System.out.println("三角形1:");
		System.out.println("周长: " + t1.getPerimeter());
		System.out.println("面积: " + t1.getArea());

		 gmy1 t2 = new  gmy1(7, 8, 9);
		System.out.println("\n三角形2:");
		System.out.println("周长: " + t2.getPerimeter());
		System.out.println("面积: " + t2.getArea());
		}
		}
