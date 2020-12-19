package demonew;

import java.util.Scanner;

public class strongpd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cc;
		boolean np= false,up= false,lp = false;
Scanner input=new Scanner(System.in);
System.out.println("Enter the password");
String str=input.nextLine();
int n=str.length();


if(n>=8)
{
  for (int i = 0; i <n; i++) 
   {
    cc= str.charAt(i);
    if (Character.isDigit(cc))
      {
        np= true;
       }
    else if (Character.isUpperCase(cc)) 
       {
        up = true;
        } 
    else if (Character.isLowerCase(cc))
        {
        lp = true;
        } 
    }
}
   if(np && up && lp)
   {
	   System.out.println("password is strong ");
   }
   else
   {
	   System.out.println("password is not strong");
   }
     
}

}
	


