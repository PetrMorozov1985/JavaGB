package ru.geekbrains.gb;

public class HomeWork1
{
    public static void main (String[] args) {
        System.out.println("Good morning, Wolrd!");


// № 2


// № 3
        float a = 2;
        float b = 4;
        float c = 7;
        float d = 3;

        float calculator = a * (b + (c / d));
        System.out.println(calculator);

// № 4
        int g = 10;
        int h = 5;
        long isBetween10and20 = g + h;
        System.out.println(isBetween10and20);

        if (isBetween10and20 >= 10 && isBetween10and20 <= 20) {
            System.out.println("Огонь!");
// № 5
            int k = -2;
            if (k >= 0) {
                System.out.println("Положительное число!");
            } else if (k < 0) {
                System.out.println("Отрицательное число!");
            }
// № 6
            int l = -2;
            if (!(l >= 0))
            {
                System.out.println("Так и есть.");
            }
// № 7
            String name = "Иван";
            System.out.println("Привет, " + name + "!");
// № 8
            int  year= 2021;
            if ( year % 4 == 0 && year % 100 != 0)
            {
                System.out.println(year + " год високосный!");
            }
            else if (year % 400 == 0)
            {
                System.out.println(year + " год високосный.");
            }
            else
            {
                System.out.println(year + " год не високосный.");
            }





        }

    }
}
