public class HWJava001 {
    public static void main(String[] args) {
        int[] arr6 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr8 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr11 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nTask 1: ");
        System.out.println(doTask1(1, 9));
        System.out.println("\nTask 2: ");
        doTask2(-13);
        System.out.println("\nTask 3: ");
        System.out.println(doTask3(-25));
        System.out.println("\nTask 4: ");
        doTask4("Строка", 5);
        System.out.println("\nTask 5: ");
        System.out.println(doTask5(1900));
        System.out.println("\nTask 6: ");
        doTask6(arr6);
        System.out.println("\nTask 7: ");
        doTask7(100);
        System.out.println("\nTask 8: ");
        doTask8(arr8);
        System.out.println("\nTask 9: ");
        doTask9();
        System.out.println("\nTask 10: ");
        doTask10(5, 1);
        System.out.println("\nTask 11: ");
        doTask11(arr11);
    }
    /* 1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
        пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    */
    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;

    }

    /* 2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    public static void doTask2(int h) {
        if (h >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    /* 3.Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /*4.Написать метод, которому в качестве аргументов передается строка и число,
     метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    /* 5.* Написать метод, который определяет, является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false). Каждый 4-й год является
    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    public static boolean doTask5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    // 6.Заменить 0 на 1, 1 на 0;
    public static void doTask6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 7.Заполнить массив значениями 1 2 3 4 5 6 7 8 … 100;
    public static void doTask7(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    //8.Задать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void doTask8(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /*9.Создать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно).
    */

    public static void doTask9() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*10.Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
    равна initialValue;
    */

    public static void doTask10(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    // 11.*Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void doTask11( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
