package operaters;

import java.util.Scanner;

public class GreatestUsingTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = (a > b) ? a : b;
        System.out.println("Greater number: " + greater);
	}

}
