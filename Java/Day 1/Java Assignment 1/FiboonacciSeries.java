import java.util.Scanner;
public class FiboonacciSeries{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of fibonacii series: ");
		int size = sc.nextInt();
		int n1=0;
		int n2=1;
		if(size == 1){
			System.out.print(n1+" ");
		}
		else if(size == 2){
			System.out.print(n1+" "+n2+" ");
		}
		else{
			System.out.print(n1+" ");
			System.out.print(n2+" ");
			for(int i=2;i<size;i++){
				int n3=n1+n2;
				System.out.print(n1+n2+" ");
				n1=n2;
				n2=n3;
			}
		}
	}
}