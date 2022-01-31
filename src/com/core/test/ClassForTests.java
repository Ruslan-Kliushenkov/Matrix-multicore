package com.core.test;

import java.util.Random;
import java.util.Scanner;

public class ClassForTests {

    private static Random random = new Random();
    private static int matrixLength;

    public static void main(String[] args) {
        MultiBuilder.createMatrix(askForMatrixLength());
    }

    private static int askForMatrixLength() {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write matrix length");
            input = scanner.nextLine();
        }while (!validator(input));
        return Integer.parseInt(input);
    }

    public static boolean validator(String text) {
        if (!text.replace(" ", "").matches("\\d+")) {
            System.out.println("Incorrect value");
            System.out.println("Please, try again");
            return false;
        }
        return true;
    }
}
