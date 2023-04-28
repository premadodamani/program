package programs;

import java.util.Scanner;

public class Fibunocy
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	int c = 0;
	System.out.println(a+""+b);
	for(int i=1;i<=18;i++) {
		 c=a+b;
		
		a=b;
		b=c;
}
	System.out.println(c);
}
}
