package demo3_26;

import java.util.Arrays;
import java.util.Random;

public class 冒泡排列 {

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
		System.out.println("降序排列后最大的三个数：" + arr[0] + "," + arr[1] + "," + arr[2]);
		Arrays.sort(arr);
		System.out.println("升序排列后最大的三个数是：" + Arrays.toString(arr));

	}
}
