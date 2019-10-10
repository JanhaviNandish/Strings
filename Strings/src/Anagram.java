import java.util.Scanner;
//wap to check anagram or not
class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string 1");
		String s1=scan.nextLine();
		System.out.println("enter string 2");
		String s2=scan.nextLine();
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		if(s1.length()==s2.length())
		{
			s1=toLowerCase(s1);
			s2=toLowerCase(s2);
			s1=sort(s1);
			s2=sort(s2);
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println("not anagram");
					return;
				}
			}
			System.out.println("anagram");		
		}
		else
		{
			System.out.println("not anagram1");
		}
	}

	static String toLowerCase(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
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

	static String removeSpace(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp += s.charAt(i);
			}
		}
		return temp;
	}

	static String sort(String s)
	{
		String temp="";
		char[] ar = s.toCharArray();
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length;j++)
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
}
