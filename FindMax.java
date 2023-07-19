import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N");
        int N = sc.nextInt();

        // int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= N; i++)
        {
            System.out.println("Enter the Number => "+i);
            int newV = sc.nextInt();
            // max = Math.max(max, newV);
            min = Math.min(min, newV);
        }
        //System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);
    }
}
