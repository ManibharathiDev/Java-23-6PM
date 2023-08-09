class Recursive
{
    public static void main(String[] args) {
        int i = 1;
        recur(i);
    }

    public static void recur(int i)
    {
        if(i == 5 || i == 0)
            return;
        i = i+1;
        System.out.println("Pre Recur=>"+i);
        recur(i);
        System.out.println("Post Recur=>"+i);
        // i = i-1;    
        // recur(i);
    }

}