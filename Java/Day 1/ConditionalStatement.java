import java.util.Scanner;
public class ConditionalStatement{
	public static void main(String[] args){
		int numOne;
		int numTwo;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		numOne = sc.nextInt();
		System.out.println("Enter second number");
		numTwo = sc.nextInt();

		if(numOne > numTwo){
			System.out.print("The greater number is: " + numOne);
		}
		else{
			System.out.print("The greater number is: " + numTwo);
		}
	}
}