package demo3_26;

import java.util.Arrays;
import java.util.Random;

public class ð������ {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("�������к�������������" + arr[0] + "," + arr[1] + "," + arr[2]);
		Arrays.sort(arr);
		System.out.println("�������к������������ǣ�" + Arrays.toString(arr));

	}
}
