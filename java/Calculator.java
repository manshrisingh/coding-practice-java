import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first number:");
		double num1=sc.nextDouble();						System.out.println("Enter second number:");
		double num2=sc.nextDouble();
		double sum=num1+num2;
		double subtraction=num1-num2;
		double multiplication=num1*num2;
		System.out.println("Sum:"+sum);
		System.out.println("Subtraction:"+subtraction);
		System.out.println("Multiplication:"+multiplication);
		double division=0;
		if(num2!=0){
			division=num1/num2;
			System.out.println("Division:"+division);
		}
		else{
			System.out.println("Undefined(cannot divide by zero)");
		}
		sc.close();
	}
}
