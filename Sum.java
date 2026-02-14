public class Sum {
    public static void main(String[] args) {
        int []a={1,2,3};
       int count=0;
        int k=2;
        int sum[]=new int[a.length];
        sum[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            sum[i]=sum[i-1]+a[i];
            if(sum[i-1]==k){
                count++;
            }
            else if( sum[i]-sum[i-1]==k){
                count++;
               }
            }
            System.out.println(count);
        }
       
       
    }

