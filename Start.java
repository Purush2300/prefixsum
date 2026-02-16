public class Start {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int l=1;
        int r=2;

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
        if(r>=a.length){
            System.out.println("enter a valid index");
        }
        else if(l==0){
            int p=a[r];
            System.out.println(p);
        }
        else{
            int s=a[r]-a[l-1];
            System.out.println(s);
        }
        

       
        
    
      
    }
}
