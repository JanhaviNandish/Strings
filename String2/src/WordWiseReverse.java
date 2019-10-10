import java.util.Scanner;

//wap to reverse a given input string word wise
public class WordWiseReverse
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s= scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		String[] ar= new String[count+1];
		int j=0;
		String temp="";
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)!=' ')
			{
				temp +=s.charAt(i);
			}
			else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				ar[j] =temp;
				j++;
				temp= "";
			}
		}
		ar[j]=temp;
		temp="";
		for(int i=s.length();i>0;i--)
		{
			temp += (ar[i])+" ";
		}
		temp += ar[0];
		System.out.println(temp);

	}
}