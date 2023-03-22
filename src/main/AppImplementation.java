package main;

import java.util.Scanner;

public class AppImplementation {


    public void runApp() {
        Scanner in = new Scanner(System.in);
        System.out.println("-----------Calculator---------");


            double answer = 0;
            while (true) {
                try {
                    System.out.print("Enter the operator (+, -, *, / : or x or X to exit : ");
                    char op = in.next().charAt(0);
                    while(op != 'x' && op != 'X' && op != '+' && op != '-' && op != '*' && op != '/') {
                        System.out.print("Please enter a valid operator : ");
                        op = in.next().charAt(0);
                    }
                        if (op == 'x' || op == 'X') {
                            break;
                        }

                        System.out.print("Enter first number: ");
                        double num1 = in.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = in.nextDouble();

                        switch (op) {
                            case '+' -> answer = sum(num1, num2);
                            case '-' -> answer = substract(num1, num2);
                            case '*' -> answer = multiply(num1, num2);
                            case '/' -> answer = divide(num1, num2);
                            default -> System.out.println("Please enter a valid operator!!");
                        }

                } catch (Exception e) {
                    System.out.println("Invalid Operation");
                }
                System.out.println("Your final result is : " + answer);
            }
    }

    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double substract(double num1, double num2) {
        return num1 - num2;
    }


    private double multiply(double num1, double num2) {
        return num1 * num2;
    }


    private double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("You can't divide with 0");
        }
        return num1 / num2;
    }

}
