import java.util.Scanner;
public class CompareObject{
	public static void main(String [] args){
		CompareObject obj1 = new CompareObject();
		CompareObject obj2 = new CompareObject();
		if(obj1.equals(obj2)){
			System.out.print("The two objects are equal");
		}else{
			System.out.print("The two objects are not equal");
		}
	}
}