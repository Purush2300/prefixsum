import java.util.HashSet;
public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int []a={1,1,2,3,1};
        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i])){
                System.out.println("duplicate present");
                return;
            }
            set.add(a[i]);
        }
System.out.println("no duplicate");
    }
    
}
