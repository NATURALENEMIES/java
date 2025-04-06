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

	// �˷���ʵ���������Ԫ�صĺ�

	public static int getSum(int[] a) {
		int sum = 0;
		for(int i = 0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}

	// �˷���ʵ���������е����ֵ

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

	// �˷���ʵ���������е���Сֵ

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

	// �˷���������Ԫ����������

	public static void sort(int a[]) {
		Arrays.sort(a);
	}

	// �˷���������������Ԫ�ص�ֵ

	public static void outputArray(int[] a) {
		for(int n:a) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}

	// �˷���������������Ԫ�ص�ֵ

	public static void reverseOutputArray(int[] a) {
		int i;
		for(i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();

	}

	// �������������϶���ĸ�����

	public static void main(String[] args) {
		int[] x = new int[5];
		int max = 0;
		int min = 0;
		System.out.println("����������Ԫ��");
		inputArray(x);
		System.out.println("����������ֵΪ��");
		max = getMax(x);
		System.out.println(max);
		System.out.println("���������СֵΪ��");
		min = getMin(x);
		System.out.println(min);
		Arrays.sort(x);
		//System.out.println(Arrays.toString(x));
		System.out.println("�˷���������������Ԫ�ص�ֵ��");
		outputArray(x);
		System.out.println("�˷���������������Ԫ�ص�ֵ��");
		reverseOutputArray(x);
	}
}
