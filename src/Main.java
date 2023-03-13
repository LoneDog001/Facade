import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите первое двоичное число");
        String firstNumber = scr.next();
        System.out.println("Введите второе двоичное число");
        String twoNumber = scr.next();
        System.out.println("Выберете операцию из списка:\n 1.Сложить\n 2.Умножить");
        int choice = scr.nextInt();
        switch (choice) {
            case 1:
                try {
                    System.out.println("Полученный результат = " + bins.sum(firstNumber, twoNumber));
                } catch (NumberFormatException e) {
                    System.out.println("Не правильно введены числа. Попробуйте сначала");
                }
                break;
            case 2:
                try {
                    System.out.println("Полученный результат = " + bins.mult(firstNumber, twoNumber));
                } catch (NumberFormatException e) {
                    System.out.println("Не правильно введены числа. Попробуйте сначала");
                }
                break;
        }
        System.out.println("До встречи!");
    }
}
