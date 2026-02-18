import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer >a=new HashMap<>();
       int[]b={1,2,3,4,1};
       int total=5;
        for (int i = 0; i < b.length; i++) {
            int res=total-b[i];
            if(a.containsKey(res)){
                System.out.println(a.get(res)+" "+i);
            }
            a.put(b[i],i);
        }
        
    }
    
}
