import java.util.Scanner;

public class if1 {
	public static void main(String[] args) {
		// ����Scanner��������ȡ�û�����
		Scanner scanner = new Scanner(System.in);

		// ��ʾ�û������һ������
		System.out.println("�������һ������: ");
		double num1 = scanner.nextDouble();
		// ��ȡ�û�����ĵ�һ������
		// ��ʾ�û�����ڶ�������
		System.out.println("������ڶ�������: ");
		double num2 = scanner.nextDouble();
		// ��ȡ�û�����ĵڶ�����
		// �����������ֵĺ�
		double sum = num1 + num2;
		// ������
		System.out.println("�������ֵĺ���: " + sum);
		/*
		 * Scanner scanner = new Scanner(System.in); final int COUNT = 5; // ����Ҫ��������ָ���
		 * double[] numbers = new double[COUNT]; double sum = 0;
		 * 
		 * for (int i = 0; i < COUNT; i++) { System.out.print("�������" + (i + 1) +
		 * "������: "); numbers[i] = scanner.nextDouble(); sum += numbers[i]; // �ۼ���� }
		 * 
		 * System.out.println(COUNT + "�����ֵĺ���: " + sum); scanner.close(); } }
		 */

	/*	// {��ϰ}����int�жϺ��ܷ�������������ӡ��ʾ��Ϣ
*/		// System.out.println("�������һ��������");
		// Scanner src = new Scanner(System.in);
		// for(
		// int[] num1 = new src.nextInt();
		// System.out.println("������ڶ���������");
		// Scanner src = new Scanner(System.in);
		// int[] num2 =
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("sum���Ա�����������");
		} else {
			System.out.println("sum���ܱ�����������");
		}
	}
}
