package ch5;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		/*System.out.println("请输入一个正数");
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		if(judge(a))
			System.out.println("该数为一个素数");
		else {
			System.out.println("该数不是素数");

		}*/
		System.out.println("验证哥德巴赫猜想：");
		verifyGoldbach();
	}
	public static boolean judge(int x) {
		if(x == 1) {
			return false;
		}
		else if(x == 2) {
			return true;
		}
		else if(x != 2 && x % 2 == 0) {
			return false;
		}
		else 
		{
			int i;
			for(i = 3;i * i <= x;i+=2) {
				if(x % i == 0)
					return false;
			}
		}
		return true;
	}
	public static void verifyGoldbach() {
		int num,i;
		boolean x = true;
		for(num = 4;num <= 100;num += 2) {
			boolean found = false;
			for(i = 2;i <= num/2;i++) {
				if(judge(i)&&judge(num - i)) {
					//System.out.println(num + "=" + i + "+" + (num - i));
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("哥德巴赫猜想在" + num + "不成立");
				x = false;
			}
		}
		if(x)
			System.out.println("哥德巴赫猜想成立");
	}
}
