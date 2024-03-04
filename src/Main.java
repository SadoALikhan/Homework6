import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3:");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задание 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5:");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задание 7:");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача 9:");
        int investment = 29000;
        int totalInvestment = 0;
        for (int i = 1; i <= 12; i++) {
            totalInvestment = totalInvestment + totalInvestment/100 + investment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalInvestment + " рублей.");
        }

        System.out.println("Задача 10:");
        int number = 2;
        int table = 0;
        for (int i = 1; i <= 10; i++) {
            table = i * number;
            System.out.println(number + "*" + i + "=" + table);
        }
    }
}