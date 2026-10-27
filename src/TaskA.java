import java.util.Scanner;
public class TaskA {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int[] n={5, 7, 32, 8, 2};
        int s=0;
        for(int i=0;i<n.length;i++) {

            s +=n[i];
        }
        double a=(double) s/n.length;

        System.out.println(a);

        for(int i=0;i<n.length;i++) {
            if(a<n[i]) {
                System.out.println(n[i]);
            }
        }
    }
}
