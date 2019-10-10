import java.util.Scanner;

//wap to reverse a given input String word wise and with the same index
public class LetterWiseReverse 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		String[] ar = new String[count+1];
		int j=0;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			{
				temp += s.charAt(i);
			}
			else if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
			{
				ar[j]=temp;
				j++;
				temp= "";
				
			}
		}
		ar[j]=temp;
		temp+="";
		for(int i=0;i<ar.length-1;i++)
		{
			temp+= reverse(ar[i])+" ";
		}
		temp+= reverse(ar[ar.length-1]);
		System.out.println(temp);
	}

	private static String reverse(String s)
	{
		String temp = "";
		for(int i=s.length()-1;i>0;i--)
		{
			temp+= s.charAt(i);
		}
		return temp;
	}

}
