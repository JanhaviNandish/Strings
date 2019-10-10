import java.util.Scanner;

class PairsOfAnagram 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		scan.nextLine();
		String[] ar= new String[n];
		System.out.println("enter the string");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextLine();
		}
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				boolean b = checkAnagram(ar[i],ar[j]);
				if(b)
				{
					System.out.println("(" +ar[i]+ "," +ar[j] +")");
				}
			}
		}
	}

	static boolean checkAnagram(String s1, String s2) 
	{
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
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	static String sort(String s) 
	{
		String temp="";
		char[] ar =s.toCharArray();	
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
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
}