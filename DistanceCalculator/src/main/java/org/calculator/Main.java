package org.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance 1: ");
        Double param1 = scanner.nextDouble();

        System.out.print("Metres or yard? ");
        String unit1 = scanner.next();

        System.out.print("Distance 2: ");
        Double param2 = scanner.nextDouble();

        System.out.print("Metres or yard? ");
        String unit2 = scanner.next();

        System.out.print("Expected unit in metres or yard? ");
        String expectedUnit = scanner.next();

    }
}