// Lab 5A

import java.util.Scanner;

public class Lab5A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean permit, commercial;

        System.out.print("Do you have a driving permit (Y/N)? ");
        String input = sc.nextLine();

        permit = input.equalsIgnoreCase("Y");

        if (permit) {
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            input = sc.nextLine();

            commercial = input.equalsIgnoreCase("Y");

            if (commercial) {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            } else {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        } else {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }
    }
}
