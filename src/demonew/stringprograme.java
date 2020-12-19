package demonew;

import java.io.PrintStream;
import java.util.Arrays;

public class stringprograme {

	public static void main(String[] args) {
		String s1="hello";
		String s2="";
		int l=s1.length();
		
		int i;
		//System.out.println("hello".substring(1,4));
		//int c=0,i;
		 
		for(i=l-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);

			
		}
		System.out.println(s2);
		
	/*System.out.println(s1);
	String s3="hello world";
	StringBuilder b1=new StringBuilder();
	
	b1.append(s3);
	b1=b1.reverse();
	System.out.println(b1);*/
	
	
	
		
		
		
		
		
		
	
	
/*String str1="rock";
String str2="star";
String str3;
//concatenation of string
str3=str1.conCat(str2);
System.out.println(str3);
//length of string
System.out.println("length is:"+str3.length());
//character at position
System.out.println("character is:"+str3.charAt(4));
//index of character
System.out.println("index is:"+str3.indexOf('s'));
//contains method
System.out.println("contains sequence 'tar':"+str3.contains("tar"));
//endsWith method
System.out.println("ends with 'r':"+str3.endsWith("r"));
//replace method
System.out.println("replace 'rock' with 'duke':"+str3.replace("rock", "duke"));
//toLowercase method
System.out.println("convert to lowercase:"+str3.toLowerCase());
//toUppercase method
System.out.println("convert to uppercase:"+str3.toUpperCase());
		//reverse the string
		String str="welcome to java";
		StringBuilder input=new StringBuilder();
		input.append(str);
		input=input.reverse();
		System.out.println(input);
		//converting string toCharArray method 
		char[] t=str.toCharArray();
		for(int i=t.length-1;i>=0;i--)
		{
			System.out.print(t[i]);
		}
		//string Palindrome 
		String str4="madam";
		String rev="";
		int length=str4.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+str4.charAt(i);
		if(str4.equals(rev))
		{
			System.out.println("string is palindrone:"+str4);
		}
		else
		{
			System.out.println("string is not palindrone:"+str4);
			
		}
		/*String str1="welcome to world";
		String str2="welcome to world";
		String str3="welcome to selenium";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		//reverse a string
		String str="abcde";
		String rev=new StringBuffer(str).reverse().toString();
		System.out.println(rev);
				//convert string into array
				String str4="hello world";
				char[] t=str4.toCharArray();
				for(int i=0;i<str4.length();i++)
				{
					System.out.println(t[i]);
				}
				//replace a character at a specific position
				String str5="geeks gor geeks";
				int index=6;
				char ch='f';
				StringBuilder str6=new StringBuilder(str5);
				str6.setCharAt(index, ch);
				System.out.println("after replacing the character 'g': "+str6);
				//count no of character in a given string
				String str7="welcome to google";
				int count=0;
				for(int i=0;i<str7.length();i++)
				{
					if(str7.charAt(i)!=' ')
						count++;
				}
				System.out.println("total no of characters:"+count);
		
	String str8="brag";
	String str9="grab";
	if(str8.length()!=str9.length())
		System.out.println("Both the strings are not anagram");
	char []ch1=str8.toCharArray();
	char[]ch2=str9.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2)==true)
	{
		System.out.println("both strings are anagram");
	}
	else
	{
		System.out.println("both strings are not anagram");
	}*/
	
	}

	private static int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
		
		
		
	
				
	
	


