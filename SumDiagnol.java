class SumDiagnal{
    public static void main(String[] args)
    {
        int[][] A = {
            {1,2,3,4},
            {
                10,11,12,13
            },
            {
                20,21,22,23
            },
            {
                28,29,30,32
            }
        };

        // for(int i = 0; i<A.length; i++)
        // {
        //     System.out.println(A[i][i]);
        // }

        int sum = 0 ;   
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j< A[0].length; j++)
            {
                if(i == j)
                {
                   sum = sum +A[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}