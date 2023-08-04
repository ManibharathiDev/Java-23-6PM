public class RowTotal {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        a[0][0] = 51;
        a[0][1] = 52;
        a[0][2] = 53;

        a[1][0] = 54;
        a[1][1] = 55;
        a[1][2] = 56;

        a[2][0] = 57;
        a[2][1] = 58;
        a[2][2] = 59;

       
         for(int i = 0; i < a.length; i++)
        {
            int sum  = 0;
            for(int j = 0; j<a[i].length; j++)
            {
                sum = sum + a[i][j];
            }
            System.out.println(sum);
        }

    }
}
