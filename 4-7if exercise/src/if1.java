import java.util.Scanner;

public class if1 {
	public static void main(String[] args) {
		// 创建Scanner对象来读取用户输入
		Scanner scanner = new Scanner(System.in);

		// 提示用户输入第一个数字
		System.out.println("请输入第一个数字: ");
		double num1 = scanner.nextDouble();
		// 读取用户输入的第一个数字
		// 提示用户输入第二个数字
		System.out.println("请输入第二个数字: ");
		double num2 = scanner.nextDouble();
		// 读取用户输入的第二个数
		// 计算两个数字的和
		double sum = num1 + num2;
		// 输出结果
		System.out.println("两个数字的和是: " + sum);
		/*
		 * Scanner scanner = new Scanner(System.in); final int COUNT = 5; // 定义要输入的数字个数
		 * double[] numbers = new double[COUNT]; double sum = 0;
		 * 
		 * for (int i = 0; i < COUNT; i++) { System.out.print("请输入第" + (i + 1) +
		 * "个数字: "); numbers[i] = scanner.nextDouble(); sum += numbers[i]; // 累加求和 }
		 * 
		 * System.out.println(COUNT + "个数字的和是: " + sum); scanner.close(); } }
		 */

	/*	// {练习}定义int判断和能否被三和五整除打印提示信息
*/		// System.out.println("请输入第一个数正数");
		// Scanner src = new Scanner(System.in);
		// for(
		// int[] num1 = new src.nextInt();
		// System.out.println("请输入第二个数正数");
		// Scanner src = new Scanner(System.in);
		// int[] num2 =
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("sum可以被三和五整除");
		} else {
			System.out.println("sum不能被三和五整除");
		}
	}
}
