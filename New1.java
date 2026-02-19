import java.util.HashMap;
public class New1 {
    public static void main(String[] args) {
           HashMap<Integer, Integer >map=new HashMap<>();
           int []a={23,2,4,6,7};
           int k=6;
           int count=0;
           int total=0;
           for (int i = 0; i < a.length; i++) {
            total+=a[i];
            int reminder=total%k;
            if(reminder<0){
                reminder+=k;
            }
            if(map.containsKey(reminder)){
                count+=map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder, 0)+1);
           }
         System.out.println(count); 
    }
}
