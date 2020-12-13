package homework_1;

import java.sql.SQLOutput;

public class Lesson1 {
    public static void main(String[] args) {
        doExercise1(2, 3, 10, 3);
        System.out.println(doExercise2(2,20));
        System.out.println(doExercise3(0));
        System.out.println(doExercise4("Антон"));
        System.out.println(doExercise5(2016));
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
        return (a+b>= 10 && a+b <= 20);
    }
    //Задание №3;

    private static boolean doExercise3(int a) {
        return a>=0;

    }
    //Задание №4;

    private static String doExercise4(String name) {
        String expression = "Привет " + name + "!";
        return expression;
    }

    //Задание №5;
    private static boolean doExercise5(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

    }
}
