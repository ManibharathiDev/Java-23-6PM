public class FindArrayMax {
    public static void main(String[] args) {
        int[] A = {100,135,25};
        int max = A[0];
        for(int i = 1; i < A.length; i++)
        {
            max = Math.max(max,A[i]);
        }
        System.out.println(max);
    }
}
