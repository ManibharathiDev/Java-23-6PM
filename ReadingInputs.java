import java.util.Scanner;
public class ReadingInputs {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String myName = sc.nextLine();
         System.out.println(myName);
        
         //Reading Character
        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);

        /*int a = sc.nextInt();
        System.out.println(a);

        byte c = sc.nextByte();
        System.out.println(c);
        short b = sc.nextShort();
        System.out.println(b);
        float d = sc.nextFloat();
        System.out.println(d);
        double e = sc.nextDouble();
        System.out.println(e);
        boolean bool = sc.nextBoolean();
        System.out.println(bool);
        //char ch = sc.nextChar();*/

        
    }
}
