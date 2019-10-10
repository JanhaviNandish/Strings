import java.util.Scanner;

//wap to sort input string in alphabetical order
public class Sort 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String temp= "";
		System.out.println("enter string");
		String s=scan.nextLine();
		char[] ar = s.toCharArray();
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					char t = ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<s.length();i++)
		{
			temp += ar[i];
		}
		System.out.println(temp);
	}
	
}
