package constructor123;

public class constructor {

	static int a;
	static char b;
	
	constructor()
	{
		a=10;
		b='M';
	}
	
	constructor(int n)
	{
		a=90;
		b='D';
	}
	
	constructor(int s,char h)
	{
		a=00;
		b='P';
	}
	
	constructor(char f,int t)
	{
		a=9;
		b='g';
	}
	
	public static void main(String[] args) {
		
		new constructor();
		System.out.println(a);
		System.out.println(b);
		
		new constructor(5);
		System.out.println(a);
		System.out.println(b);
		
		new constructor(3,'r');
		System.out.println(a);
		System.out.println(b);
		
		new constructor('k',7);
		System.out.println(a);
		System.out.println(b);
	}
}
