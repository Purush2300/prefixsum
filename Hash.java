import java.util.HashSet;
public class Hash {

    public static void main(String[] args) {
         HashSet<Integer> a=new HashSet<>();
         int[]n={1,2,2,3,3,3,1,1,5,5,3,2,1};
         for (int i = 0; i < n.length; i++) {
            a.add(n[i]);
         }
    System.out.println(a.size());
    
        }
   
}
