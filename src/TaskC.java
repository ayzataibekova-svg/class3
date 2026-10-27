import java.util.Scanner;
public class TaskC {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // all values are 0
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
            System.out.print( numbers[i] +" ");
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;
        System.out.println("Average = " + avg);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg)
                System.out.print(numbers[i] + " ");

        }
    }
}