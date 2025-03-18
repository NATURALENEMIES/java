package demo;

public class car {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i != j) {
					for (int k = 32; k <= 99; k++) {
						int licensePlate = i * 1100 + j * 11;
						if (licensePlate == k * k) {
							System.out.println("ÅÆÕÕºÅÊÇ£º" + licensePlate);

						}
					}
				}
			}
		}
	}
}
