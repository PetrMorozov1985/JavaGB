package ru.geekbrains.gb;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {

/* №1. Задать целочисленный массив, состоящий из элементов
0 и 1.Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0; */
        System.out.println("Work №1");
        int[] arrayFirst = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayFirst));

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = arrayFirst[i] == 1 ? 0 : 1;
            System.out.print(arrayFirst[i] + ", ");
        }
        System.out.println(" ");
/* №2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        System.out.println("Work №2");
        int[] arrSecond = new int[8];

        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = i * 3;
            System.out.print(arrSecond[i] + ", ");
        }
        System.out.println(" ");
/* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        System.out.println("Work №3");
        int[] arrLessSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrLessSix.length; i++) {
            if (arrLessSix[i] < 6) arrLessSix[i] *= 2;
            System.out.print(arrLessSix[i] + " ");
        }
        System.out.println(" ");
/* 4. Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные
элементы единицами;*/

        System.out.println("Work №4");
        int[][] arrDiagonal = new int[5][5];
        for (int i = 0; i < arrDiagonal.length; i++) {
            for (int j = 0, j2 = arrDiagonal[i].length; j < arrDiagonal[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arrDiagonal[i][j] = 1;
                System.out.print(arrDiagonal[i][j] + " ");
            }
            System.out.print("\r\n");
        }

/*5. ** Задать одномерный массив и найти в нем
минимальный и максимальный элементы
(без помощи интернета);*/

        System.out.println("Work №5");
        int[] arrMaxMinElement = {15, 3, 25, 1, 428, 78, 45, 9, 14, 4, 55, 6};
        int min = arrMaxMinElement[0]; int max = arrMaxMinElement[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arrMaxMinElement.length; i++) {
            if (arrMaxMinElement[i] > max) {
                max = arrMaxMinElement[i];
                indMax = i;
            }
            if (arrMaxMinElement[i] < min) {
                min = arrMaxMinElement[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент в массиве  " + max + ", минимальный эелемент в массиве " + min);
    }
}



