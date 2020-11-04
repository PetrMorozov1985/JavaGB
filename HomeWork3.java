package ru.geekbrains.gb;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {


    public static void main(String[] args) {

        System.out.println("Task № 1");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int guess = -1;
        int number = random.nextInt(10);

        do{
            while (count < 3 && guess != number)
            {
                System.out.print("Загадайте число от 0 до 9. У Вас 3 попытки. ");
                guess = scanner.nextInt();
                if (number != guess)
                {
                    System.out.println("Ваш номер " + ((guess > number) ? "больше" : "меньше"));
                    count++;
                }
            }
            System.out.println("Вы " + ((guess == number) ? "Победили!" : "Проиграли: " + number));
            System.out.println("Хотите сыграть снова? Да - 1, Нет - 0");
        } while (scanner.nextInt() == 1);

    }
}
