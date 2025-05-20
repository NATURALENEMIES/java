package CH3;

public class C1 {
	public static int gcd(int num1, int num2) {
		if (num1 <= 0 || num2 <= 0) {
			throw new IllegalArgumentException("参数必须为正整数");
		}
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

	public static void main(String[] args) {
		try {
			int result = gcd(12, 8);
			System.out.println("最大公约数为: " + result);
			gcd(-12, 8);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}