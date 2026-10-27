import java.util.Scanner;
public class TaskD {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("avarage: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
            System.out.print( numbers[i] +" ");
        }

        int max=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.print("\nMaximum = " + max);


    }
}