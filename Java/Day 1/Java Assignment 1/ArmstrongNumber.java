import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String args[]){
		int n;
		System.out.println("Enter the Value: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		int org=n;
		int count=0;
		int temp=n;
		while(n!=0){
			int d=n%10;
			count++;
			n=n/10;
		}
		while(temp!=0){
			int d=temp%10;
			int counter=count;
			int div=1;
			while(counter!=0){
				div=div*d;
				counter--;
			}
			sum+=div;
			temp=temp/10;
		}
		if(org==sum){
			System.out.print(org+" is a Amstrong number");
		}
		else{
			System.out.print(org+" is not a Amstrong number");
		}
	}
}