
import java.util.Scanner;
public class juxing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����볤");
		int a = sc.nextInt();
		System.out.println("�������");
		int b = sc.nextInt();
		double S =a*b;
		double C =2*(a+b);
		System.out.printf("���ε������.%2f",S);
		System.out.printf("���ε��ܳ���.%2f",C);
	}

}
