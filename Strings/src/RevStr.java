//wap to reverse the given input string in array
import java.util.Scanner;

public class RevStr
{
	public static void main(String[] args) 
		{		
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the String");
		String s= scan.nextLine();
		char[] ar= s.toCharArray();
		for(int i=0;i<ar.length/2;i++)
		{
			char t=ar[i];
			ar[i]= ar[ar.length-1-i];
			ar[ar.length-1-i]=t;
		}
		String temp = "";
		for(int i=0;i<ar.length;i++)
		{
			temp+=ar[i];			
		}
		System.out.println(temp);
	}

}
