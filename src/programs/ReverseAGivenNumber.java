package programs;

import java.util.Scanner;

public class ReverseAGivenNumber {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("entre the number which is to be reverse");
	n=sc.nextInt();
	int rev=0;
	while(n!=0) {
		int rem=n%10;
		rev=rev*10+rem;
	
	n=n/10;
}
	System.out.println(rev);
}
}
