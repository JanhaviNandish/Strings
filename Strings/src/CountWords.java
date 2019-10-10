import java.util.Scanner;

//wap to count how many words are there in a given input string
public class CountWords 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.println("enter the string");
		String s = scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("no of words: "+(count+1));
	}
}
