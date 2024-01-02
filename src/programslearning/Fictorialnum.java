package programslearning;

import java.util.Scanner;

public class Fictorialnum {
	public static void main(String[] args) {
	int n,fect=1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number : ");
	n=s.nextInt();
	for(int i=1;i<=n;i++) {
		fect=fect*i;
	}
	System.out.println("Fectorial is  : " +fect);
	
	}
}
