package text;

public class Ñ­»·Ìå {

	public static void main(String[] args) {
		double sum = 1,term = 1;
		int flag = 1;
		for(int n = 2;n <= 20;n++)
		{
			flag =-flag;
			term *= 1.0/n;
			sum +=flag*term;
		}
		System.out.println("sum ="+sum);
	}

}
