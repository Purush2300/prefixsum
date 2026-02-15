import java.util.HashMap;
public class Sumequalk {
    public static void main(String[] args) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int []b={1,2,1,2,1};
        int count=0;
        int prefix=0;
        int k=3;
        for (int i = 0; i < b.length; i++) {
            prefix+=b[i];
            if(a.containsKey(prefix-k)){
                count+=
            }
        }

        System.out.println(count);
        }
    
}
