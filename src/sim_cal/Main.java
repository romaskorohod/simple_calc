package sim_cal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vvedite operatsiyu");
        System.out.println("1. Slozhenie");
        System.out.println("2. Vychitanie");
        System.out.println("3. Umnozhenie");
        System.out.println("4. Delenie");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Vvedite pervoe chislo");
        int a = scanner.nextInt();
        System.out.println("Vvedite vtoroe chislo");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Rezultat = " + result);
    }
}