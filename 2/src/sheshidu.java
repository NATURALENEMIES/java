import java.util.Scanner;

public class sheshidu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入摄氏度");
		double C = sc.nextDouble();
		System.out.printf("摄氏度为",+C);
		double F = (9/5)*C+32;
		System.out.printf("华氏度为：.%1f",F);
	}

}
