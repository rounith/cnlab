import java.util.*;
public class Char
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of Characters : ");
		int n=sc.nextInt();
		String in[]=new String[n];
		for(int i=0;i<n;i++)
		{
			in[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			if(in[i].equals("DLE"))
			{
				in[i]="DLE DLE";
			}
		}
		System.out.print("Transmitted Message is  "+"DLE STX ");
		for(int i=0;i<n;i++)
		{
			System.out.print(in[i]+" ");
		}
		System.out.print("DLE ETX");
		sc.close();
		int i = 0;
		System.out.println("\nOriginal Message : "+in[i]);
	}
}
