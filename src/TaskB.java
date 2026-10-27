import java.util.Scanner;
public class TaskB {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // all values are 0

        int sum = 0;
        for (
                int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;
        System.out.println("Average = " + avg);

        for (
                int i = 0;
                i < numbers.length; i++) {
            if (numbers[i] > avg)
                System.out.print(numbers[i] + " ");

        }
    }
}