
public class Q2 
{

	public static void main(String[] args) 
	{
		for (int i=1; i<=100; i++)
		{
			int pen=getPentagonalNumber(i);
			System.out.print(pen+" ");
			if (i%10==0)
			{
				System.out.println();
			}
		}
		
	

	}
	public static int getPentagonalNumber(int n)
	{
		return(n*((3*n)-1)/n);
		
	}

}
