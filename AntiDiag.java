public class AntiDiag {
    public static void main(String[] args) {
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
        

        for(int i = 0; i < A.length; i++)
        {
            System.out.println(A[i][A.length-(i+1)]);
        }

    }
}
