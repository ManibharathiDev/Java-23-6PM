import java.util.Scanner;
public class Branching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 5)
        {
            System.out.println("A is Five");
        }
        else if(a == 4)
        {
            System.out.println("A is Four");
        }
        else
        {
            System.out.println("A is other number");
        }

    }
}
