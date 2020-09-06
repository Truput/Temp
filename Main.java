package com.company;

public class Main {

    public static void main(String[] args) {
        task01();
        task02();
        task03();
        task04();
        task05();
        task11();
        task12();
        task13();
        task14();
    }

    public static void task01() {
        // Дан массив целых чисел, найти 1.  Четные и нечетные числа.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71};

        System.out.println("Четные числа: ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Нечетные числа: ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void task02() {
        // Найти Наибольшее и наименьшее число.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            } else if (arr[i] < min) {

                min = arr[i];
            }
        }
        System.out.println("Наибольшее число = " + max);
        System.out.println("Наименьшее число = " + min);
    }

    public static void task03() {
        // Найти числа, которые делятся на 3 или на 9

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71};
        int count = 0;

        System.out.println("Числа, которые делятся на 3 или на 9:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 3 == 0 || arr[i] % 9 == 0) {

                System.out.print(arr[i] + ", ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Нет таких чисел!");
        }
        System.out.println();
    }

    public static void task04() {
        // Найти Числа, которые делятся на 5 и на 7

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71};
        int count = 0;
        System.out.println("Числа, которые делятся на 5 и на 7:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {

                System.out.print(arr[i] + ", ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет таких чисел!");
        }
        System.out.println();
    }

    public static void task05() {
        // Найти Отсортированные числа в порядке возрастания и убывания.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71};

        int temp = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        sorted = false;
        temp = 0;
        System.out.println();

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i + 1] > arr[i]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void task11() {
        // Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71};

        int longestNumber = arr[0];
        int count = 0;


        for (int i = 0; i < arr.length; i++) {

            if (lengthOfNumber(arr[i]) > lengthOfNumber(longestNumber)) {

                longestNumber = arr[i];
            } else if (lengthOfNumber(arr[i]) == lengthOfNumber(longestNumber)) {

                count++;
            }
        }

        if (count > 0) {
            System.out.println("Чисел с длиной " + lengthOfNumber(longestNumber) + " найдено " + count);
        }

        System.out.println("Самое длинное число = " + longestNumber + ", а его длина = " + lengthOfNumber(longestNumber));

        System.out.println();

        int shortestNumber = arr[0];
        count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (lengthOfNumber(arr[i]) < lengthOfNumber(shortestNumber)) {

                shortestNumber = arr[i];
            } else if (lengthOfNumber(arr[i]) == lengthOfNumber(shortestNumber)) {

                count++;
            }
        }

        if (count > 0) {
            System.out.println("Чисел с длиной " + lengthOfNumber(shortestNumber) + " найдено " + count);
        }

        System.out.println("Самое короткое число = " + shortestNumber + ", а его длина = " + lengthOfNumber(shortestNumber));

        System.out.println();
    }

    public static void task12() {
        // Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71, 5454, 123, 656598, 5589};

        int temp;
        boolean sorted = false;


        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (lengthOfNumber(arr[i]) > lengthOfNumber(arr[i + 1])) {

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (lengthOfNumber(arr[i]) < lengthOfNumber(arr[i + 1])) {

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task13() {
        // Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71, 5454, 123, 656598, 5589};

        double avrgLength = 0;
        int sumOfLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sumOfLength += lengthOfNumber(arr[i]);
        }

        avrgLength = (double) sumOfLength / arr.length;

        System.out.println("Числа, длина которых меньше средней:");

        for (int i = 0; i < arr.length; i++) {

            if (lengthOfNumber(arr[i]) < avrgLength) {
                System.out.println(arr[i] + ", а его длина = " + lengthOfNumber(arr[i]));
            }
        }

        System.out.println();
    }

    public static int lengthOfNumber(int number) {
        String numberToString;
        int length;

        numberToString = String.valueOf(number);
        length = numberToString.length();

        return length;
    }

    public static void task14() {
        // Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

        int arr[] = {5, 6, 10, 25, 93, 12, 0, 71, 5454, 123, 656598, 5589};

        double avrgLength = 0;
        int sumOfLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sumOfLength += lengthOfNumber(arr[i]);
        }

        avrgLength = (double) sumOfLength / arr.length;

        System.out.println("Числа, длина которых меньше средней:");

        for (int i = 0; i < arr.length; i++) {

            if (lengthOfNumber(arr[i]) < avrgLength) {
                System.out.println(arr[i] + ", а его длина = " + lengthOfNumber(arr[i]));
            }
        }

        System.out.println();
    }

    public static int lengthOfNumber(int number) {
        String numberToString;
        int length;

        numberToString = String.valueOf(number);
        length = numberToString.length();

        return length;
    }
}


