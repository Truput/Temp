package by.com.company.fp;

import java.util.Scanner;

public class Hometask023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int beginngOfInterval;
        int number;
        int endOfInterval;

        System.out.println("Please, enter the beginning of interval");
        do {
            String stringBeginning = scanner.next();
            try {
                beginngOfInterval = Integer.parseInt(stringBeginning);
                check = true;
                System.out.println("You entered correct number");
            } catch (NumberFormatException e) {
                beginngOfInterval = 0;
                System.out.println("You entered incorrect number! Try again");
            }
        } while (!check);
        check = false;
        System.out.println("Please, enter the number");
        do {
            String stringNumber = scanner.next();
            try {
                number = Integer.parseInt(stringNumber);
                check = true;
                System.out.println("You entered correct number");
            } catch (NumberFormatException e) {
                number = 1;
                System.out.println("You entered incorrect number! Try again");
            }
        } while (!check);
        check = false;
        System.out.println("Please, enter the end of interval");
        do {
            String stringEnd = scanner.next();
            try {
                endOfInterval = Integer.parseInt(stringEnd);
                check = true;
                System.out.println("You entered correct number");
            } catch (NumberFormatException e) {
                endOfInterval = 10;
                System.out.println("You entered incorrect number! Try again");
            }
        } while (!check);
        if (beginngOfInterval >= endOfInterval) {
            throw new IllegalArgumentException("Wrong interval");
        }
        if (number > beginngOfInterval && number < endOfInterval) {
            System.out.println("The number belongs to entered interval");
        } else {
            System.out.println("The number doesn't belong to interval");
        }
    }
}
