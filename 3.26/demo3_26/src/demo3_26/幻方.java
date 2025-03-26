package demo3_26;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class �÷� {

		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			int[][] matrix = new int[3][3];
			System.out.println("������3x3�����Ԫ�أ�ÿ�������������ÿո�ָ�����");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					matrix[i][j] = scanner.nextInt();
				}
			}
			Set<Integer> uniqueElements = new HashSet<>();
			for (int[] row : matrix) {
				for (int num : row) {
					if (!uniqueElements.add(num)) {
						System.out.println("���ǻ÷���Ԫ���ظ�");
						return;
					}
				}
			}
			int baseSum = matrix[0][0] + matrix[0][1] + matrix[0][2];
			for (int i = 1; i < 3; i++) {
				int currentSum = matrix[i][0] + matrix[i][1] + matrix[i][2];
				if (currentSum != baseSum) {
					System.out.println("���ǻ÷����кͲ�ƥ��");
					return;
				}
			}
			for (int j = 0; j < 3; j++) {
				int currentSum = matrix[0][j] + matrix[1][j] + matrix[2][j];
				if (currentSum != baseSum) {
					System.out.println("���ǻ÷����кͲ�ƥ��");
					return;
				}
			}
			int diag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
			int diag2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
			if (diag1 != baseSum || diag2 != baseSum) {
				System.out.println("���ǻ÷����Խ��ߺͲ�ƥ��");
				return;
			}
			System.out.println("�ǻ÷�");
		}
	}
