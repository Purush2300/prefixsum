public class NoPrefix {
   public static void main(String[] args) {
    int []a={1,2,3,4};
    a[0]=a[0];
    for (int i = 1; i < a.length; i++) {
        for (int j = i; j <=i; j++) {
            a[i]=a[i-1]+a[i];
            System.out.println(a[i-1]);
            
        }
        
    }
   } 
}
