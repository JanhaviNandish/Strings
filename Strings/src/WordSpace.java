//wap to count how many multiple spaces are there in between words
import java.util.Scanner;

public class WordSpace
{
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&& s.charAt(i+1)==' ')
			{
			   count++;	
			}
		}
		System.out.println("no of space:" +(count+1));
	}
}
