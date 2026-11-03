import java.util.Scanner;
public class class7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n]; // all values are 0
        System.out.print("Array Values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 201) - 100;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        System.out.print("Updated array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


import java.util.Scanner;
import java.util.Arrays;
public class class8 {
    Scanner in = new Scanner(System.in);

    public static double getAverage(int[] arr) {
        double sum = 0;
   /*
   for(int i=0; i<arr.length; i++){
       sum +=arr[i];
   }*/
        for (int item : arr) {
            sum += item;
        }

        return sum / arr.length;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        double avg = getAverage(numbers);

        System.out.println("Average  = " + avg);

        // print items greater than average
        for (int item : numbers) {
            if (item > avg) {
                System.out.print(item + " ");
            }
        }

    }
}


import java.util.Scanner;
import java.util.Arrays;
public class Pe {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int[][]table=new int[4][6];

        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                table[i][j]=(int)(Math.random()*200);
            }
        }
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
               System.out.printf("%4d",table[i][j]);
            }
            System.out.println();
        }
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class Pw {
    public static void print2dArray(int[][] arr){
        for( int[] row: arr){
            for(int item: row){
                System.out.printf( "%4d",item);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] table = new int[n][m];

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                table[i][j] = (int)(Math.random() * 200);
            }
        }
        int[][] matrix = new int[5][5];

        for (int[] row : matrix) {
            Arrays.fill(row, -1);
        }
        print2dArray(table);
        System.out.println();
        print2dArray(matrix);
    }
}



import java.util.Scanner;
import java.util.Arrays;
public class Pq {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int[][]table=new int[n][m];
        int count=1;

        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                table[i][j]=count;
                count++;
            }
        }
        for(int i=0;i<table.length;i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }

    }
}



