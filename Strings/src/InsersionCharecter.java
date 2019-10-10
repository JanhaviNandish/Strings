import java.util.Scanner;

//wap to insert star before every vowels and space before every consonant, before space there is a special character #
public class InsersionCharecter 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
			{
				if(s.charAt(i)=='A' ||s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				{
					temp+= "*"+s.charAt(i);
				}
				else 
				{
					temp+= " "+s.charAt(i);
				}
			}
			else if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				temp+= s.charAt(i);
			}
			else
			{
				temp+= "#"+s.charAt(i);
			}
		}
		System.out.println(temp);

	}

}
