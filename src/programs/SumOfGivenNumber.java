package programs;

import java.util.Scanner;

public class SumOfGivenNumber 
{
	public static void main(String[] args) {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     n=sc.nextInt();
     int sum=0;
     while(n!=0) {
    	 int rem=n%10;
    	 sum=sum+rem;
    	 n=n/10;
     }
     System.out.println(sum);
	}
}
