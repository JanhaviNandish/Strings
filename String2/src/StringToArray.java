import java.util.Scanner;

//wap to convert string to array
public class StringToArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
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
		String temp= "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp += s.charAt(i);
			}
			else if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
			{
				ar[j] = temp;
				j++;
				temp= "";
			}

		}
		ar[j]=temp;
		//temp += "";
		for(int i=ar.length-1;i>0;i++)
		{
			//temp += ar[i]+" ";
			System.out.println(ar[i]);
		}
		//temp +=ar[0];
		//System.out.println(temp);
	}
}
