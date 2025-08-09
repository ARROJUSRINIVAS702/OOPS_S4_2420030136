package operaters;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the numbers");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c=	a+b;
		int d=	a-b;
		int f=	a*b;
		int g=	a%b;
		int h=	a/b;
		System.out.println("sum = "+ c);
		System.out.println("sub = "+ d);
		System.out.println("mul = "+ f);
		System.out.println("div = "+ h);
		System.out.println("rem = "+ g);
	}

}
