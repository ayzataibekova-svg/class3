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
