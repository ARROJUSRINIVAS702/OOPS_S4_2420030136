package operaters;

import java.util.Scanner;

public class conditionalOperaters {

	public static void main(String[] args) {
		System.out.println("Enter  two numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt();

        if (x > y) {
            System.out.println(x + " is greatest");
        } else if (y > x) {
            System.out.println(y + " is greatest");
        } else {
            System.out.println("Both are equal");
        }
	}

}
