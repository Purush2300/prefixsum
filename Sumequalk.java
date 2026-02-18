import java.util.HashMap;
public class Sumequalk {
public static void main(String[] args) {
    HashMap<Integer ,Integer> map =new HashMap<>();
    int []a={1,-1,-1,1,1};
    int k=2;
    int count=0;
    int prefixsum=0;
    for (int i = 0; i < a.length; i++) {
        prefixsum+=a[i];
        if(map.containsKey(prefixsum-k)){
            count+=map.get(prefixsum-k);
        }
        map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
    }
    System.out.println(count);
}
    
}