public class TwoDimen {
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

        System.out.println("Length of Row "+a.length);

       // System.out.println(a[0][2]);

        int[][] b = {
            {4,5,6},
            {6,8,9},
            {3,4,5,7}
        };

         for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j<b[i].length; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }

        // for(int i = 0; i < a.length; i++)
        // {
        //     for(int j = 0; j<a[i].length; j++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println("");
        // }





    }
}
