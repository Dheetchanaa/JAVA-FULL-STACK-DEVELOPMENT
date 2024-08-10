import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		System.out.print("Enter a digit: ");
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n;i++){
			if(n%i==0){
			count++;
			}
		}
		if(count==1){
			System.out.print(n+" is a prime number");
		}
		else{
			System.out.print(n+" is not a prime number");
		}
	}
}