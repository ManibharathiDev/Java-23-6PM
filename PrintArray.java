public class PrintArray {
    public static void main(String[] args) {
        //int[] m = {10,20,30,40,50,60};

        int[] m = new int[6];
        m[0] = 10;
        m[1] = 20;
        m[2] = 30;
        m[3] = 40;
        m[4] = 50;
        m[5] = 60;

        for(int i = 0; i < m.length; i++)
        {
            System.out.println(m[i]);
        }
    }
}
