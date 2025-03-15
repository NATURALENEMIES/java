import java.util.Scanner;

public class shu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëËæÒâÊäÈëÊı×Ö");
		double M = sc.nextDouble();
		int li = (int)M;
		double Y = M - li;
		System.out.printf(""+Y);
		System.out.printf("\t.%4f",Y);
	}

}
