package demo3_26;

import java.util.Random;

public class 生成数35 {

	public static void main(String[] args) {
		int[][] matrix = new int[5][7];
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				matrix[i][j] = random.nextInt(100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				sum += matrix[i][j];
			}
		}
		double average = sum / 35;
		System.out.println("平均值: " + average);
		int max = matrix[0][0], min = matrix[0][0];
		int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxRow = i;
					maxCol = j;
				}
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minRow = i;
					minCol = j;
				}
			}
		}
		System.out.println("最大: " + max + " 在 (" + maxRow + ", " + maxCol + ")");
		System.out.println("最小: " + min + " 在 (" + minRow + ", " + minCol + ")");
	}

}
