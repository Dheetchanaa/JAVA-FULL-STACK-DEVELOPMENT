import java.util.Scanner;
public class ArrayConcept{
	public static void main(String[] args){
		int array[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integer values");
		
		for(int i=0;i<array.length;i++){
			array[i] = sc.nextInt();
		}

		System.out.println("Array elements: ");
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.print("Sum of array elements is: "+sum);
	}
}