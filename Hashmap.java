import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer >a=new HashMap<>();
        int []b={1,2,3,4,5,5};
        for (int i = 0; i < b.length; i++) {
           int n=b[i];
            if(a.containsKey(n)){
               int value= a.get(n);
               a.put(n, value+1);
            }


           else{
            a.put(n, 1);
           }
        }
        System.out.println(a);
    }
    
}
