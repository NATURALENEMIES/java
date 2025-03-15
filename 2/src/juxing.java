
import java.util.Scanner;
public class juxing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长");
		int a = sc.nextInt();
		System.out.println("请输入宽");
		int b = sc.nextInt();
		double S =a*b;
		double C =2*(a+b);
		System.out.printf("矩形的面积：.%2f",S);
		System.out.printf("矩形的周长：.%2f",C);
	}

}
