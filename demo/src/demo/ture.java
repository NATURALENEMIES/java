package demo;

import java.util.Scanner;

public class ture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		boolean flag = true;
		int j, k;
		j = a % 10;
		while (a > 9 && flag) {
			a = a / 10;
			k = a % 10;
			if (j > k) {
				flag = false;
			}
			j = k;
		}
		if (flag)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
