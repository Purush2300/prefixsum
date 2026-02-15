public class Start {
    public static void main(String[] args) {
        int []a={-3,2,-3,4,2};
        // int[] prefixsum=new int[a.length+1];
        // // prefixsum[0]=a[0];
        // prefixsum[0]=0;
        // for (int i = 1; i < prefixsum.length; i++) {
        //     prefixsum[i]=prefixsum[i-1]+a[i];
        // }
        // for (int i = 1; i < prefixsum.length; i++) {
        //     prefixsum[i]=prefixsum[i-1]+a[i-1];
        // }
        a[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            a[i]=a[i]+a[i-1];
           
        }
        for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
        }
        
    
      
    }
}
