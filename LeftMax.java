public class LeftMax {
    public static void main(String[] args) {
        int[] A = {2,3,5,1,2,6};
        int[] B = new int[A.length];
        B[0] = A[0];
        for(int i = 1; i < A.length; i++)
        {
            B[i] = Math.max(A[i], B[i-1]);
        }

        for(int i = 0; i<B.length; i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}
