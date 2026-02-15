public class Start {
    public static void main(String[] args) {
        int []a={-3,2,-3,4,2};
        int st=1;
        for (int i = 0; i < a.length; i++) {
            
            int temp=st;
            int sum=temp+a[i];
          
            if(sum>0){
               st=sum;
               System.out.println(sum);
            }

        }
    
      
    }
}
