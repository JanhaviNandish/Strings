import java.util.Scanner;

class Occurrences 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s = scan.nextLine();
		int c=0;
		char count = 0;
		s=lowerCase(s);
		s=sort(s);
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				c++;
			}
			else
			{
				c++;
				System.out.println(s.charAt(i)+"comes"+count+"times");
				c=0;
			}
			System.out.print((s.charAt(i))+(s.length()-1)+"comes"+(c+1)+"times");
		}
	}
	static String sort(String s)
	{
		String temp="";
		char[] ar =s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(ar[i]>ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			temp += ar[i];
		}
		return temp;
	}

	static String lowerCase(String s)
	{	
		String temp ="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				temp += (char)(s.charAt(i)+32);
			}
			else
			{
				temp += s.charAt(i);
			}
		}
		return temp;
	}
}