import java.util.Scanner;

public class TaskE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n]; // all values are 0

        System.out.print("Array Values: ");
        for(int i = 0; i< numbers.length; i++ ) {
            numbers[i] = (int)(Math.random() * 100);
            System.out.print(numbers[i] + " ");
        }

        int max = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if ( numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("\nMaximum = " + max);
    }
}
