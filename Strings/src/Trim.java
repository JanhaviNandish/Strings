//wap to perform trim or to remove white spaces from the beginning and end
import java.util.Scanner;
public class Trim
{
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		int st=0;
		int ed=0;
		String temp= "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			   st=i;
			   break;
			}
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				ed=i;
				break;
			}
		}
		for(int i=st;i<=ed;i++)
		{
			temp += s.charAt(i);
		}
		System.out.println(temp);
	}
}
