package demo;
import java.util.Scanner;
public class ch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ÿ��ǧ�׻���Ļ����˷�price: ");
		double price = scanner.nextDouble();

		System.out.print("�������������weight: ");
		double weight = scanner.nextDouble();

		System.out.print("���������s: ");
		double s = scanner.nextDouble();

		double discount;
		if (s < 250) { // ���ｫ&lt;��Ϊ<
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
		System.out.println("���˷�Ϊ: " + freight);

		scanner.close();
	}

}
