import java.util.Scanner;

public class AcceptNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            System.out.println("Entered: " + num);
        } while (num != 0);
	}

}
