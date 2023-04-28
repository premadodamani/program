package programs;

import java.util.Scanner;

public class PrimeNumber
{
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	n=sc.nextInt();
	boolean flage=true;
	for(int i=2;i<=n;i++) {
		if(n%2==0) {
			flage=false;
			break;
		}
	}
	if(flage==true) {
		System.out.println("given number is a prime number");
	}else {
		System.out.println("given number is not a prime number");
	}
}
}
