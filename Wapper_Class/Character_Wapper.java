import java.io.*;
class charcter
{
	public static void main(String[] args)
	{
		char ch[]={'@','a','7',' ','A'};
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
				System.out.println(ch[i]+"is a digit");
			if(Character.isLetter(ch[i]))
				System.out.println(ch[i]+"is a letter");
			if(Character.isLowerCase(ch[i]))
				System.out.println(ch[i]+"is a lowercase");
			if(Character.isUpperCase(ch[i]))
				System.out.println(ch[i]+"is a uppercase");
			if(Character.isWhitespace(ch[i]))
				System.out.println(ch[i]+"is a whitespace");
		}
		System.out.println(Character.isLetter(65));
		System.out.println(Character.isLetter(64));
	}
}