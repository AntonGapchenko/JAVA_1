package homework_2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        changeArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        fillArray(new int[8]);
        multipleArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        findMinandMax(new int[]{15, 105, 55, 32, 3, 1, 45, 99, 17});
        fillDiagonals(new int[7][7]);
        System.out.println(splitArray(new int[]{1, 1, 1, 2, 1}));
        System.out.println(splitArray(new int[]{2, 1, 1, 2, 1}));
        System.out.println(splitArray(new int[]{10, 1, 2, 3, 4}));
        shiftArray(new int[]{1,2,3,4,5},2);
        shiftArray(new int[]{1,2,3,4,5},-2);


    }

    //Задание№1;
    private static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Задание№2;
    private static void fillArray(int[] array) {
        for (int i = 0, j = 1; i < array.length; i++, j += 3) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Задание№3;
    private static void multipleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Задание№4;

    private static void findMinandMax(int[] array) {
        int min = array[0];
        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Минимальное значение:" + min + " Максимальное значение:" + max);

    }
    //Задание 5;

    private static void fillDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if ((i == j) || (i == array.length - 1 - j)) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Задание 6;

    private static boolean splitArray(int[] array) {
        int sumLeft = 0;
        int sumRight = sumArray(array,0,array.length);
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            sumRight -= array[i];
            if (sumLeft == sumRight) {
                return true;
            }

        }
        return false;

    }
    public static int sumArray(int[] array, int start, int finish) {
        int sum = 0;
        for (int i = start; i < finish; i++) {
            sum += array[i];
        }
        return sum;
    }


    //Задание№7;
    private static void shiftArray(int[] array, int n) {
         if (n>0){
             for (int i = 0; i < n; i++) {
                 int temp=array[array.length-1];
                 for (int j = array.length-1; j >0; j--) {
                     array[j]=array[j-1];
                     
                 }array[0]=temp;

             }
         }else if (n < 0) {
             for (int i = 0; i < n*(-1) ; i++) {
                 int temp = array[0];
                 for (int j = 0; j < array.length - 1; j++) {
                     array[j] = array[j + 1];
                 }
                 array[array.length - 1] = temp;
             }

         }
        System.out.println(Arrays.toString(array));
    }

    }


