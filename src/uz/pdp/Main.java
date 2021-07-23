package uz.pdp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kalkulatorga hush kelibsiz!!!");

        while (true){
            System.out.println("Bajarmoqchi bo'lgan amalingizni tanlang:");

            Scanner scanner = new Scanner(System.in);

            String amal = scanner.nextLine();

            System.out.println("Birinchi raqamni kiriting: ");
            int a = scanner.nextInt();
            System.out.println("Ikkinchi raqamni kiriting: ");
            int b = scanner.nextInt();

            int result;


            switch (amal) {
                case "+" -> {
                    result = a + b;
                    System.out.println("Javob = " + result);
                }
                case "-" -> {
                    result = a - b;
                    System.out.println("Javob = " + result);
                }
                case "*" -> {
                    result = a * b;
                    System.out.println("Javob = " + result);
                }
                case "/" -> {
                    result = a / b;
                    System.out.println("Javob = " + result);
                }
                default -> System.out.println("Notogri amal kiritdingiz!!!");
            }
        }
    }
}
