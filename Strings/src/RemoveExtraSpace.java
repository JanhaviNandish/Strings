import java.util.Scanner;

//wap to remove the spaces between the words

public class RemoveExtraSpace 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+= s.charAt(i);
			}
			else if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
			{
				temp+=s.charAt(i);
			}
		}
		
		System.out.println(temp);
	}

}
