public class Constant {
    public static void main(String[] args)
    {

        final double PI = 3.14;
        //PI = 3.67; // Can't reassign

        final double PIS;
        PIS = 3.14; // Assign Later
        System.out.println(PIS);
        System.out.println(PI);
        PIS = 6.78;
    }
}
