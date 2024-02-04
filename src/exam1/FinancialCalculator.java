package exam1;

import java.util.Scanner;

public class FinancialCalculator {
    private static double[] expenses = new double[30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            menu();
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    expensesDay();
                    break;
                case 2:
                    expensesMonth();
                    break;
                case 3:
                    maxsum();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nНеверный выбор, попробуйте еще раз.");
                    break;
            }
        } while (true);
    }

    private static void menu() {
        System.out.println("\nМеню:");
        System.out.println("1 - ввести расходы за определенный день");
        System.out.println("2 - траты за месяц");
        System.out.println("3 - самая большая сумма расхода за месяц");
        System.out.println("0 - выход");
        System.out.print("Введите номер пункта меню: ");
    }

    private static void expensesDay() {
        Scanner sc1 = new Scanner(System.in);
        Scanner spending = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        do {
            System.out.println("введите день от (1-30)");
            int day = sc1.nextInt();

            if (day < 1 || day > 30) {
                System.out.println("Неверный выбор, попробуйте еще раз.");
            } else {
                System.out.println("Укажите сумму трат за этот день");
                double sp = spending.nextDouble();
                expenses[day - 1] = sp;

                System.out.print("Введите трату за другой день? (Да/Нет): ");
                String answer = str.next();

                if (!answer.equalsIgnoreCase("Да")) {
                    return;
                }
            }
        } while (true);
    }

    private static void expensesMonth() {
        System.out.println("\nТраты за месяц:");
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Расходы за " + (i + 1) + " день: " + expenses[i] + " рублей");
        }

        do {
            Scanner ex = new Scanner(System.in);
            System.out.println("\nвведите 0 чтобы выйти в меню");

            int exit = ex.nextInt();
            if (exit == 0)
                break;
            else {
                System.out.println("Чтобы выйти, нужно ввести 0\n");
                continue;
            }
        } while (true);
    }

    private static void maxsum() {
        double maxExpense = 0;
        int maxExpenseDay = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
                maxExpenseDay = i + 1;
            }
        }
        System.out.println("\nСамая большая сумма расхода за месяц:");
        System.out.println(maxExpenseDay + " день - " + maxExpense + " руб");

        do {
            Scanner ex = new Scanner(System.in);
            System.out.println("\nвведите 0 чтобы выйти в меню");

            int exit = ex.nextInt();
            if (exit == 0)
                break;
            else {
                System.out.println("Чтобы выйти, нужно ввести 0\n");
                continue;
            }
        } while (true);
    }
}
