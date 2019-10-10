//wap to convert upper case characters to lower case and lower case to upper case
import java.util.Scanner;

public class CaseConversion 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		String temp= "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				temp+= (char)(s.charAt(i)+32);
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				temp+= (char)(s.charAt(i)-32);
			}
			else
			{
				temp+= s.charAt(i);
				
			}
		}
		System.out.println(temp);
	}

}
