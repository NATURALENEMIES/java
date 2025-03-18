package demo;
import java.util.Scanner;
public class ch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入每吨千米货物的基本运费price: ");
		double price = scanner.nextDouble();

		System.out.print("请输入货物重量weight: ");
		double weight = scanner.nextDouble();

		System.out.print("请输入距离s: ");
		double s = scanner.nextDouble();

		double discount;
		if (s < 250) { // 这里将&lt;改为<
		discount = 0;
		} else if (s < 500) {
		discount = 0.02;
		} else if (s < 1000) {
		discount = 0.05;
		} else if (s < 2000) {
		discount = 0.08;
		} else if (s < 3000) {
		discount = 0.1;
		} else {
		discount = 0.15;
		}

		double freight = price * weight * s * (1 - discount);
		System.out.println("总运费为: " + freight);

		scanner.close();
	}

}
