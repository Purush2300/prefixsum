import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> a=new HashSet<>();
        int count=0;
        int []b={1,2,2,3,4,4,5,5,5,6,7,7,7,8};
        // int c=b.length;
        for (int i = 0; i < b.length; i++) {
            // if(a.contains(b[i])){
            //    c--;
               
            // }
              a.add(b[i]);
              
             
        }
      
System.out.println(a.size());

    }
}
