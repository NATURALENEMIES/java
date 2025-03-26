package demo3_26;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 幻方 {

		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			int[][] matrix = new int[3][3];
			System.out.println("请输入3x3矩阵的元素（每行三个整数，用空格分隔）：");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					matrix[i][j] = scanner.nextInt();
				}
			}
			Set<Integer> uniqueElements = new HashSet<>();
			for (int[] row : matrix) {
				for (int num : row) {
					if (!uniqueElements.add(num)) {
						System.out.println("不是幻方：元素重复");
						return;
					}
				}
			}
			int baseSum = matrix[0][0] + matrix[0][1] + matrix[0][2];
			for (int i = 1; i < 3; i++) {
				int currentSum = matrix[i][0] + matrix[i][1] + matrix[i][2];
				if (currentSum != baseSum) {
					System.out.println("不是幻方：行和不匹配");
					return;
				}
			}
			for (int j = 0; j < 3; j++) {
				int currentSum = matrix[0][j] + matrix[1][j] + matrix[2][j];
				if (currentSum != baseSum) {
					System.out.println("不是幻方：列和不匹配");
					return;
				}
			}
			int diag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
			int diag2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
			if (diag1 != baseSum || diag2 != baseSum) {
				System.out.println("不是幻方：对角线和不匹配");
				return;
			}
			System.out.println("是幻方");
		}
	}
