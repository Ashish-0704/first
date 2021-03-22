package first;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
					{3,1,5},{4,1,2},{7,5,9}	
					};
		int[][] b = {
					{2,0,1},{9,8,7},{3,6,1}
					};
		System.out.println("Matrix A is :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix B is :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		int[][] c = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		int[][] d = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j] = 0;
				for(int k=0;k<3;k++)
				{
					d[i][j] = a[i][k] + b[k][j];
				}
			}
		}
		System.out.println("Addition matrix is :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	 }
}
