package B2;

// Main.java - ������
public class Main {
public static void main(String[] args) {
	// ����Shape���͵����鲢�������ͼ�ζ���
	Shape[] shapes = new Shape[3];
	shapes[0] = new Rectangle(5, 3); // ��5��3�ľ���
	shapes[1] = new Circle(2); // �뾶2��Բ
	shapes[2] = new Cylinder(2, 5); // �뾶2��5��Բ����

	// �������鲢�������ͼ�εĴ�С
	for (Shape shape : shapes) {
	System.out.printf("ͼ�δ�С: %.2f\n", shape.size());
	}
	}
	}