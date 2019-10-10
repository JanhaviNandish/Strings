//wap to count vowels, consonants, numbers, spaces and special charecters in the given input string 
import java.util.Scanner;

public class Vowels
{
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		int vc=0;
		int cc=0;
		int nc=0;
		int sp=0;
		int sc=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=120)
			{
			   if(s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			   {
				   vc++;
			   }
			   else
			   {
				   cc++;
			   }
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				nc++;
			}
			else if(s.charAt(i)==' ')
			{
				sp++;
			}
			else
			{
				//sc=0;
				sc++;
			}
		}
			
		System.out.println("vowels: " +vc);
		System.out.println("consonent: " +cc);
		System.out.println("number: " +nc);
		System.out.println("space: " +sp);
		System.out.println("special charecter: " +sc);
	}
}
