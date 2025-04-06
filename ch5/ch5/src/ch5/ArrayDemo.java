package ch5;

import java.util.Arrays;
import java.util.Scanner;

import org.ietf.jgss.GSSManager;

public class ArrayDemo {
	public static void inputArray(int a[]) {
		Scanner src=new Scanner(System.in);
		for(int i = 0;i < a.length;i++)
			a[i] = src.nextInt();
	}

	// 此方法实现求数组各元素的和

	public static int getSum(int[] a) {
		int sum = 0;
		for(int i = 0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}

	// 此方法实现求数组中的最大值

	public static int getMax(int[] a) {
		int max = a[0];
		for(int num : a) {
			if(max<num)
				max=num;
			else
				max = max;
				
		}
		return max;
	}

	// 此方法实现求数组中的最小值

	public static int getMin(int a[]) {
		int min = a[0];
		for(int num : a) {
			if(min>num)
				min=num;
			else
				min = min;
				
		}
		return min;
	}

	// 此方法对数组元素升序排序

	public static void sort(int a[]) {
		Arrays.sort(a);
	}

	// 此方法正序输出数组各元素的值

	public static void outputArray(int[] a) {
		for(int n:a) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}

	// 此方法逆序输出数组各元素的值

	public static void reverseOutputArray(int[] a) {
		int i;
		for(i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();

	}

	// 主方法测试以上定义的各方法

	public static void main(String[] args) {
		int[] x = new int[5];
		int max = 0;
		int min = 0;
		System.out.println("请输入数组元素");
		inputArray(x);
		System.out.println("该数组的最大值为：");
		max = getMax(x);
		System.out.println(max);
		System.out.println("该数组的最小值为：");
		min = getMin(x);
		System.out.println(min);
		Arrays.sort(x);
		//System.out.println(Arrays.toString(x));
		System.out.println("此方法正序输出数组各元素的值：");
		outputArray(x);
		System.out.println("此方法倒序输出数组各元素的值：");
		reverseOutputArray(x);
	}
}
