package demo;
import java.util.Scanner;
public class ch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ÿ��ǧ�׻���Ļ����˷�price: ");
		double price = scanner.nextDouble();

		System.out.print("�������������weight: ");
		double weight = scanner.nextDouble();

		System.out.print("���������s: ");
		double s = scanner.nextDouble();

		int interval;
		if (s < 250) { // ��&lt;��Ϊ<
		interval = 0;
		} else if (s < 500) {
		interval = 1;
		} else if (s < 1000) {
		interval = 2;
		} else if (s < 2000) {
		interval = 3;
		} else if (s < 3000) {
		interval = 4;
		} else {
		interval = 5;
		}

		double discount;
		switch (interval) {
		case 0:
		discount = 0;
		break;
		case 1:
		discount = 0.02;
		break;
		case 2:
		discount = 0.05;
		break;
		case 3:
		discount = 0.08;
		break;
		case 4:
		discount = 0.1;
		break;
		default:
		discount = 0.15;
		}

		double freight = price * weight * s * (1 - discount);
		System.out.println("���˷�Ϊ: " + freight);

		scanner.close();
	}

}
