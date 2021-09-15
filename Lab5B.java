// Lab 5B

import java.util.Scanner;

public class Lab5B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("Enter an integer: ");
        input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("This number is divisible by 2");
        } else if (input % 3 == 0) {
            System.out.println("This number is divisible by 3");
        } else if (input % 5 == 0) {
            System.out.println("This number is divisible by 5");
        } else {
            System.out.println("This number is undetermined");
        }
    }
}
