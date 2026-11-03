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

import java.util.Scanner;
import java.util.Arrays;
public class Pl {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int[][]table=new int[n][m];
        int count=1;

        for(int j=0;j<m;j++){
            for(int i=0;i<table.length;i++){
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

import java.util.Scanner;
import java.util.Arrays;
public class Pk {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int[][]table=new int[n][m];
        int count=1;

        for(int j=0;j<m;j++){
            for(int i=0;i<table.length;i++){
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
        for(int[]row:table){
            int sum=0;
            for(int item:row){
                sum+=item;
            }
            System.out.print("summa= "+sum+" ");
        }
    }
}

int[][]tabl=new int[m][n];
        for(int i=0;i<tabl.length;i++) {
            for (int j = 0; j < tabl[i].length; j++) {
                tabl[i][j]=table[i][j];
            }
            print2dArrg(tabl);
        }
