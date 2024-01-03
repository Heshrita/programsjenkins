package javapackage2;

import java.util.Scanner;

public class Swapnumwththirdvar {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number in a : ");
		a=s.nextInt();
		System.out.println("Enter number in b : ");
		b=s.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("After swaping number a is " +a);
	
	System.out.println("After swaping number b is " +b);
}

}
