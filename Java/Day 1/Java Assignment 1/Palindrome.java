import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]){
		System.out.print("Enter a number: ");
		int n;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(n!=0){
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev){
			System.out.print(temp+" is a Palindrome");
		}
		else{
			System.out.print(temp+" is not a Palindrome");
		}
	}
}