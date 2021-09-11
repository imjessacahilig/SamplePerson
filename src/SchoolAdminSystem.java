import util.Actions;

import java.util.Scanner;

public class SchoolAdminSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Admin \n 1 - Employee \n 2 - Student \n Please select to continue:");

        int type = scanner.nextInt();

        createAccount(type);

    }

    private static void createAccount(int type) {

        switch (type) {
            case 1: {
                Employee employee = new Employee();
                employee.setFirstName(Actions.inputFirstName());

                System.out.println("Account created. Welcome "+ employee.getFirstName()+"!");
                break;
            }
            case 2: {

                Student student = new Student();
                student.setFirstName(Actions.inputFirstName());
                System.out.println("Account created. Welcome "+ student.getFirstName()+"!");
                break;
            }
            default: {
                System.out.print("Account type invalid.");
            }
        }
    }



}
