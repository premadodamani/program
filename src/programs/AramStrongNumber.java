package programs;

import java.util.Scanner;

public class AramStrongNumber
{
public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the nymber");
	n=sc.nextInt();
	int sum=0;
	int copy=n;
	while(n!=0) {
		int rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if(copy==sum) {
		System.out.println("given number is armstrong number");
	}else
	{
		System.out.println("given number is not a armstrong number");
	}
}
}
