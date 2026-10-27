import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n]; // all values are 0

        System.out.print("Array Values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int a = numbers[0];
        int b = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                a= numbers[i];
            else {
                b= numbers[i];
            }
            System.out.println("even = " + a);
            System.out.println("odd = " + b);
        }
    }
}