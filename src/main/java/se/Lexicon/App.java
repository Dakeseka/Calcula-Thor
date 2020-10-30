package se.Lexicon;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        welcome();

    }

    public static void welcome() {
        System.out.println("Hi and welcome to Calcula-Thor!");
        System.out.println("To continue, press the 'any key' If not, press 'e' ");
        System.out.print("> ");

        exit();

    }

    public static void anotherOne() {
        System.out.println("If you want to preform another calculation then press the 'any key'.");
        System.out.print("If not, press 'e' > ");

        exit();

    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        input = scanner.nextLine();
        if (input.equals("e")) {
            System.out.println("Good bye then, and have a nice day!");
            System.exit(0);
        } else {

            calculator();
        }


    }


    public static void calculator() {
        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        System.out.print("> ");

        num1 = scanner.nextInt();

        System.out.println("Choose one of the following operators:");
        System.out.print("+, -, *, /. > ");
        operator = scanner.next().charAt(0);


        System.out.println("Enter the second value: ");
        System.out.print("> ");

        num2 = scanner.nextInt();


        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;

        }

        System.out.println("The answer is: " + answer + ".");

        anotherOne();

    }

}




