package lab2;
import java.util.Scanner;

//Дан массив A[n]. Найти произведение абсолютных
//величин нечетных элементов массива с четными индексами.
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array:");
        int n = -1;
        while (n <= 0) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Not a positive number.Enter size array:");
                }
            } else {
                System.out.println("Not a number. Enter size array:");
                scanner.next();
            }
        }
        int[] array = new int[n];
        for (int i=0;i<n;i++){
//            System.out.println("Enter a["+i+"]= ");
            array[i]=scanner.nextInt();
        }
        for(int element: array){
            System.out.print(element+" ");
        }
        System.out.println();
        boolean found = false;
        int mul = 1;
        for (int i = 0; i < n; i += 2) {
            if (array[i] % 2 != 0) {
                mul *= Math.abs(array[i]);
                found = true;
            }
        }
        if (found) {
            System.out.println("Result = " + mul);
        } else {
            System.out.println("No odd numbers with even indices found.");
        }
    }
}

