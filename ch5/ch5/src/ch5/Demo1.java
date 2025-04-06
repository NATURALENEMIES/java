package ch5;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println("请输入数组元素");
		int[] b = buildArray(5);
		sortArray(b);
		System.out.println("数组元素为：");
		System.out.println(Arrays.toString(b));
	}
	public static int[] buildArray(int a) {
		int x[] = new int[a];
		Scanner src=new Scanner(System.in);
		for(int i = 0;i<x.length;i++)
			x[i]=src.nextInt();
		return x;
	}
	public static void sortArray(int a[]) {
		int i,j;
		for(i = 0;i<a.length;i++) {
			int min=i;
			for(j = i;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	/*
	 * public static void printArray() {
		
	}
	*/
}
