import java.util.Scanner;
public class ASCIIValue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = sc.next();
		int asciiValue = (int)letter.charAt(0);
		System.out.print(asciiValue);
	}
}