package com.pageranking;




public class PageRanking 
{

	public static void main(String[] args) 
	{	 
		//Matrices values initialized to variables
	
				float d = (float)1/3;
				float d1 =(float)1/2;
				float d2 =(float) 1/4;
				
				//Transition matrix
				float[][] a = {{0,d1,1},{d1,d1,0},{d1,0,0}};
				//Page initialization
				float[][] b = {{d},{d},{d}};
				
				//Page Rannking algorithm
				float[][] c = multiply(a,b);
				
				
				int h =1;
				float prevsum = sumofarray(c);
				for (int i=0; i<c.length;i++) 
				{
					for (int j=0;j<c[i].length;j++) 
					{
						System.out.println("c["+i+"]["+j+"] is " +c[i][j]);
					}
				}
				float sum = 0;
				
				//h can  be varied to perform the operation till the matrix converges 
				while(h<10)
				{
					prevsum=  sum;
					
					h++;
					c = multiply(a,c);
					System.out.println("Answer is -");
					for (int i=0; i<c.length;i++) 
					{
						for (int j=0;j<c[i].length;j++) 
						{
							System.out.println("c["+i+"]["+j+"] is " +c[i][j]);
						}
					}
					System.out.println("prev sum is "+prevsum);
					System.out.println("sum is "+sum);
					
					sum =  sumofarray(c);
					System.out.println("sum is "+sum);
					
				}
				
				
	}
	
	static float sumofarray(float [][]a)
	{
		float sum =0;
		for (int i=0; i<a.length;i++) 
		{
			for (int j=0;j<a[i].length;j++) 
			{
				//System.out.println("a["+i+"]["+j+"] is " +a[i][j]);
				sum += a[i][j];
				
			}
		}
		System.out.println(sum);
		return sum;
	}

	static float[][] multiply(float [][] a,float [][] b)
	{
		float sum=0;
			int row=a.length;
			System.out.println("a.length is "+ row);
			int col=b[0].length;
			System.out.println("b col is "+col);
			float[][] multi=new float[row][col];
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					for(int k=0; k<b.length; k++) {
						System.out.println("a["+i+"]["+k+"] "+a[i][k]+" "+"b["+k+"]["+j+"] "+a[k][j]);
						sum=sum+a[i][k]*b[k][j];
					}
					multi[i][j]=sum;
					sum=0;
				}
			}
			return multi;
		}
}

