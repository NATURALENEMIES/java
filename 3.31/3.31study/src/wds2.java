
public class wds2 {
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void verifyGoldbachConjecture() {
		for (int n = 4; n <= 100; n += 2) {
			boolean found = false;
			for (int i = 2; i <= n / 2; i++) {
				if (isPrime(i) && isPrime(n - i)) {
					System.out.println(n + " = " + i + " + " + (n - i));
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("在当前范围内未找到符合条件的素数对，可能猜想不成立，对于偶数: " + n);
			}
		}
	}
	public static void main(String[] args) {
	verifyGoldbachConjecture();
	}
	}