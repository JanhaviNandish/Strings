//wap to count how many words are there in the given input strings.
import java.util.Scanner;

public class Words
{
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
			   count++;	
			}
		}
		System.out.println("no of words:" +(count+1));
	}
}
