package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number : ");
            int number = scanner.nextInt();

            if(number > 4) {
                PrintingImage image = new PrintingImage(number);
                System.out.print(image.display());
                break;
            } else {
                System.out.println("Number more than 4");
            }
        }
    }
}
