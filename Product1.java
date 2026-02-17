import java.util.Arrays;
public class Product1 {
    public static void main(String[] args) {
        int []a={2,3,4,5};
        int []output=new int[a.length];
        output[0]=1;
        for (int i = 1; i < a.length; i++) {
            output[i]=output[i-1]*a[i-1];
        }
        int left=1;
        for (int i =  a.length-1; i >=0; i--) {
            
            output[i]*=left;
            left*=a[i];
           
        }
          System.out.println(Arrays.toString(output));
       
    }
}
