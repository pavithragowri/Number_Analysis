import java.util.Scanner;


public class Largest_number 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int large=0;
		int small=0;
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = in.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>=large)
			{
				large=a[i];
			}
			
		}
		System.out.println("Large:"+large);
		//System.out.println("Small:"+small);
	}
}
