import java.util.Scanner;

public class wds3 {
	public static void inputArray(int[] a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入 " + a.length + " 个整数：");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
	}

	public static int getSum(int[] a) {
		int sum = 0;
		for (int num : a) {
			sum += num;
		}
		return sum;
	}

	public static int getMax(int[] a) {
		int max = a[0];
		for (int num : a) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static int getMin(int[] a) {
		int min = a[0];
		for (int num : a) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void outputArray(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void reverseOutputArray(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = new int[5];
		inputArray(array);

		System.out.println("数组元素的和为：" + getSum(array));
		System.out.println("数组中的最大值为：" + getMax(array));
		System.out.println("数组中的最小值为：" + getMin(array));

		sort(array);
		System.out.println("升序排序后的数组：");
		outputArray(array);

		System.out.println("逆序输出数组：");
		reverseOutputArray(array);
	}
}