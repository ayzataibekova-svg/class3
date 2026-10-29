import java.util.Scanner;
public class class6 {
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
        int a =0;
        int b =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                a++;
            else {
                b++;
            }
        }
        System.out.println("even= " + a);
        System.out.println("odd= " + b);
    }
}
