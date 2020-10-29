package ru.geekbrains.gb;

public class HomeWork1
{
    public static void main (String[] args) {
        System.out.println("Good morning, Wolrd!");


// № 2
        byte a;
        a = 1;

        short b;
        b = 2;


// № 3
        int c;
        c = 8;
        int d;
        d = 4;

        long e = a * (b + (c / d));
        System.out.println(e);

        double f;
        f = 1.1;

        //3. символьный
        // char


        //4. логический
        // boolean
// № 4
        int g = 10;
        int h = 5;
        long j = g + h;
        System.out.println(j);

        if (j >= 10 && j <= 20) {
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
            int z = 2020;


/* Если год делится на 4 без остатка, перейдите на шаг 2. ...
Если год делится на 100 без остатка, перейдите на шаг 3. ...
Если год делится на 400 без остатка, перейдите на шаг 4. ...
Год високосный (366 дней).
Год не високосный год (365 дней). */



        }

    }
}
