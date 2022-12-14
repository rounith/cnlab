import java.util.*;
public class bitstuffing
{
	public static void main(String[] args)
	{
		int i,count=0;
		Scanner str=new Scanner(System.in);
		System.out.println("Enter bits : ");
		String s1=str.nextLine();
		System.out.println("output: ");
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='1')
				count++;
			if(s1.charAt(i)=='0')
				count=0;
			System.out.print(s1.charAt(i));
			if(count==5)
			{
				System.out.print("0");
				count=0;
				str.close();
			}
		}
	}
}
