package demonew;

public class functionprogram {
	
	
	public static int min(int n1,int n2)
	{
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		return min;
		
	}
	public static  void swap()
	{
		int a=10,b=20;
		System.out.println("before swapping "+"a=" +a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+"a="+a+" b="+b);
		
	}
	public static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	
	public static void main(String[] args)
	{
		int a=10;
		int b=6;
		int c=min(a,b);
		System.out.println("minimum no is:"+c);
		swap();
		int n=5;
		int r=fact(n);
		System.out.println(r);
		
	}
	
	

}
