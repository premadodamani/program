package programs;

import java.util.Scanner;

public class StrongNumber
{
	public static void main(String[] args) 
	{
    int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
int rev=0;
int fact=1;
int copy=n;
while(n!=0) {
	int rem=n%10;
	for(int i=rem;i<=n;i++) 
	{
		fact=fact*i;
	}
	rev=rev+rem;
	n=n/10;
}
if(copy==rev)
{
System.out.println("Given number is a strong number");
}
else {
	System.out.println("given number is not a strong number");
}
}
}
