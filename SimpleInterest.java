import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int p = readInput.nextInt();
        int n = readInput.nextInt();
        int r = readInput.nextInt();
        int si = (p*n*r)/100;
        System.out.println("Simple Interest is "+si);
    }
}
