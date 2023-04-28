package programs;

import java.util.Scanner;

public class Factorial
{
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	int fact=1;
	for(int i=n;i>1;i--) {
		fact=fact*i;
	}
System.out.println(fact);
}
}
