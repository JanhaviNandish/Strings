//wap to reverse the given input string
import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		
		String temp = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp+=s.charAt(i);	
		}
		System.out.println(temp);
	}

}
