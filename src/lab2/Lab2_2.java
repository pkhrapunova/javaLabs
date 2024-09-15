package lab2;
//Дана матрица A[n][n]. Поэлементно вычесть столбец минимального
// элемента матрицы из всех строк матрицы. Отсортировать строку минимального элемента по убыванию.
import java.util.Scanner;

public class Lab2_2 {  public static void main(String[] args){
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

    int[][] array  = new int[n][n];
    System.out.print("Enter array");
    for (int i =0; i<n;i++){
        for(int j = 0; j<n;j++){
            array[i][j] = scanner.nextInt();
        }
    }
    printArray(array);

    int min = array[0][0];
    int m=0,k=0;
    for (int i =0;i<n;i++){
        for(int j = 0; j<n;j++){
            if(array[i][j]<min){
                min = array[i][j];
                m = j;
                k = i;
            }
        }
    }
    System.out.println("Min element:"+min+" index:["+ k+"]["+m+"]");
    int[] sub = new int[n];
    for (int i =0; i<n;i++){
        sub[i] = array[i][m];
        System.out.print(sub[i]+" ");
    }

    for (int i =0;i<n;i++) {
        for (int j = 0; j < n; j++) {
            array[i][j]-=sub[j];
        }
    }
    System.out.println("\nAfter subtracting the minimum element:");
    printArray(array);

    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[k][j] < array[k][j+1]) {
                int temp = array[k][j];
                array[k][j] = array[k][j+1];
                array[k][j+1] = temp;
            }
        }
    }
    System.out.println("sort:");
    printArray(array);
}

    public static void printArray(int[][]array){
        for (int[] item : array){
            for (int element : item){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
