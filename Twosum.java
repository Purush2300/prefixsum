import java.util.HashMap;
public class Twosum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int target=8;
        HashMap<Integer ,Integer> a=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num=target-arr[i];
            if (a.containsKey(num)) {
                System.out.println(a.get(num)+" "+i);
                
            }
            else{
                a.put(arr[i], i);
            }
        }
        System.out.println("no sum found");
    }
    
}
