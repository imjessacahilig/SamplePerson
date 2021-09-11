package util;

import java.util.Scanner;

public class Actions {
    static Scanner scanner = new Scanner(System.in);

    public static String inputFirstName() {

        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        return firstName;
    }
}
