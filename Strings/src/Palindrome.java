import java.util.Scanner;

//wap to check weather the given input is palindrome or not
public class Palindrome
{

	public static void main(String[] args)
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		
		String temp = "";
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				System.out.println("not palindrome");
				return;
			}
		
		}
		System.out.println("palindrome");

	}

}
