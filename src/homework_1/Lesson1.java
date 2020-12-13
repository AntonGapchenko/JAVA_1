package homework_1;

import java.sql.SQLOutput;

public class Lesson1 {
    public static void main(String[] args) {
        doExercise1(2, 3, 10, 3);
        doExercise2(10, 5);
        doExercise3(-10);
        doExercise4("Антон");
        doExercise5(2020);
    }
    //Задание №1;

    private static double doExercise1(int a, int b, int c, int d) {
        double result = 0;
        if (d == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            result = a * (b + ((double)c / d));
            System.out.println(result);
        }
        return result;
        //Try catch не стал применять.
    }
    //Задание №2;

    private static boolean doExercise2(int a, int b) {
        if (a+b>= 10 && a+b <= 20) {
            return true;
        }
        return false;
    }
    //Задание №3;

    private static void doExercise3(int a) {
        if (a >= 0) {
            System.out.println("Число - положительное");
        } else {
            System.out.println("Число - отрицательное");
        }
    }
    //Задание №4;

    private static String doExercise4(String name) {
        String expression = "Привет " + name + "!";
        System.out.println(expression);
        return expression;
    }

    //Задание №5;
    private static void doExercise5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }

    }
}
