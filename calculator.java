import java.util.*;
public class calculator {
	
	public static double Addition(double a,double b) {
		return a+b;
	}
	
	public static double Subtraction(double a,double b) {
		return a-b;
	}
	
	public static double Multiplication(double a,double b) {
		return a*b;
	}
	
	public static double Divide(double a,double b) {
		return a/b;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Enter 4 basic operands +,-,*,/ ");
		char ch = sc.next().charAt(0);
		if(ch == '+') {
			System.out.println(Addition(a,b));
		}
		else if(ch == '-') {
			System.out.println(Subtraction(a,b));
			
		}
		else if(ch == '*') {
			System.out.println(Multiplication(a,b));
			
		}
		else if(ch == '/') {
			System.out.println(Divide(a,b));
			
		}
		else {
			System.out.println("INVALID INPUT");
		}
		
	}

}
