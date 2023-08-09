import java.util.*;
public class Subset {
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(7);
        A.add(8);
        ArrayList<ArrayList<Integer>> subset = subsets(A);
        System.out.println(subset.toString());
        
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

            Collections.sort(A);
            ArrayList<Integer> curr=new ArrayList<>();   
            System.out.println("Initial Value curr=>"+curr.toString());
            ans.add(curr);
            System.out.println("Initial Value ans=>"+ans.toString());
            addList(curr,0,A);     
            return ans;


    }

    private static void addList(ArrayList<Integer> curr, int i, ArrayList<Integer> A)
    {
        if(i==A.size()) //this means we have exhausted our options for current arraylist
        {
           return;     // therefore simply return.        
        }
        curr.add(A.get(i));  
        System.out.println(i+" => Curr =>"+curr.toString());
        ans.add(new ArrayList<>(curr));
        System.out.println(i+" => ans =>"+ans.toString());
        addList(curr,i+1,A);
        System.out.println(i+" => Curr =>"+curr.toString());
        curr.remove(curr.size()-1);
         System.out.println(i+" => Curr =>"+curr.toString());
        addList(curr,i+1,A);

    }
}
