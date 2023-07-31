public class ArraySum {
    public static void main(String[] args) {
        int[] m = new int[6];
        m[0] = 10;
        m[1] = 20;
        m[2] = 30;
        m[3] = 40;
        m[4] = 50;
        m[5] = 60;

        int sum = 0;
        for(int i = 0; i < m.length; i++)
        {
            //sum = sum + m[i];
            sum += m[i];
        }
        System.out.println(sum);
    }
}
