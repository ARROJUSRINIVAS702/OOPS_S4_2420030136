package operaters;

import java.util.Scanner;

public class IncrementandDecrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Original value: " + num);
        System.out.println("Pre-increment: " + (++num));
        System.out.println("Post-increment: " + (num++));
        System.out.println("After post-increment: " + num);
        System.out.println("Pre-decrement: " + (--num));
        System.out.println("Post-decrement: " + (num--));
        System.out.println("After post-decrement: " + num);
	}

}
