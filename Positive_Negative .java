import java.util.Scanner;


public class Positive_Negative 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>=0)
		{
			System.out.println(n%100);
		}
		else
		{
			System.out.println(0);
		}
	}
}
