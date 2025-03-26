package demo3_26;

public class ì³²¨ÄÇÆõÊıÁĞ {

	public static void main(String[] args) {

		int[] fib = new int[20];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < 20; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int i = 0; i < 20; i++) {
			System.out.print(fib[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}

