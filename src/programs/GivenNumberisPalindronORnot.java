package programs;

import java.util.Scanner;

public class GivenNumberisPalindronORnot 
{
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	int rev=0;
	int copy=n;
	while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(copy==rev) {
		System.out.println("Given number is palindrome");
	}
	else {
		System.out.println("Given number is not a palindrome");
	}
}
}
