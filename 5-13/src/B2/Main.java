package B2;

// Main.java - 测试类
public class Main {
public static void main(String[] args) {
	// 创建Shape类型的数组并存入各种图形对象
	Shape[] shapes = new Shape[3];
	shapes[0] = new Rectangle(5, 3); // 长5宽3的矩形
	shapes[1] = new Circle(2); // 半径2的圆
	shapes[2] = new Cylinder(2, 5); // 半径2高5的圆柱体

	// 遍历数组并输出各类图形的大小
	for (Shape shape : shapes) {
	System.out.printf("图形大小: %.2f\n", shape.size());
	}
	}
	}