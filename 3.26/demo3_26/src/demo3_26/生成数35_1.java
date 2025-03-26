package demo3_26;

public class 生成数35_1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[][] b=new int[7][5];
			int[][] a = new int[5][7];
			for (int i = 0; i < a.length; i++)
				for (int j = 0; j < a[0].length; j++)
					a[i][j] = (int) (Math.random() * 100);
			for (int i = 0; i < a.length; i++)
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j] + "\t");
					if (j == 6) {
						System.out.println();
					}
				}
			int sum = 0, ping, s = 0;
			for (int i = 0; i < a.length; i++)
				for (int j = 0; j < a[0].length; j++) {
					sum += a[i][j];
					s++;
				}
			ping = sum / s;
			System.out.print("平均数是" + ping);
			System.out.println();
			int max = a[0][0], min = a[0][0], maxi = 0, maxj = 0, mini = 0, minj = 0;
			for (int i = 0; i < a.length; i++)
				for (int j = 0; j < a[0].length; j++) 
				{
					if (max < a[i][j]) {
						max = a[i][j];
						maxi = i+1;
						maxj = j+1;
					}
					if (min > a[i][j]) {
						min = a[i][j];
						mini = i+1;
						minj = j+1;
					}

				}
			System.out.print("最大值是" + max);
			System.out.println();
			System.out.print("最小值是" + min);
			System.out.println();
			System.out.print("最大值在" + maxi+"行"+maxj+"列");
			System.out.println();
			System.out.print("最小值在" + mini+"行"+minj+"列");
			System.out.println();
			
			int p=0;
			for (int i = 0; i < a.length; i++)
				for (int j = 0; j < a[0].length; j++) {
					if(a[i][j] > ping)
						{
						System.out.print(a[i][j] + "\t");
						p++;
						}
					if (p%5 == 0) {
						System.out.println();
					}
				}
			System.out.println();
			System.out.println();
			int l=0;
				for (int i = 0; i < a.length; i++)
					for (int j = 0; j < a[0].length; j++)
				b[j][i] =a[i][j]; 
				for (int i = 0; i < b.length; i++)
					for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j] + "\t");
				l++;	
				if (l%5 == 0) {
					System.out.println();
				}}
				
				
				
				
			}	
		
}
