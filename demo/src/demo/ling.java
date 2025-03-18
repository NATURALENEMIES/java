package demo;

public class ling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			// 上半部分
			// 外层for循环，i是行号
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i * 2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			// 下半部分
			for (int i = 4; i >= 1; i--) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i * 2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
