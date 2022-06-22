package lesson_2;

public class HomeWorkAppp {
    public static void main(String[] args) {
        betweenNum();
        isPositiveOrNegative();
        isNegative();
        printWordNTimes();
        invertArray();


    }

    public static boolean betweenNum() {
        int a = 10;
        int b = 8;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative() {
        int a = 20;
        if (a > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative() {
        int i = 7;
        if (i >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printWordNTimes() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");
    }

    public static void invertArray() {
            int[] arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == 1) {
                    arr1[i] = 0;
                } else {
                    arr1[i] =1;
                }{
                    System.out.println(arr1[i]);
                }
            }
    }
}



