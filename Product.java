public class Product {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int n=a.length;
       
        int[] output=new int[a.length];
       int sufix=1;
       output[0]=1;
       for (int i = 1; i < output.length; i++) {
        output[i]=output[i-1]*a[i-1];
       }
       for (int i = n-1; i >=0; i--) {
            output[i] *= sufix;
             sufix *= a[i];
       }
       for (int i = 0; i < output.length; i++) {
        System.out.println(output[i]);
       }
        
       
            //  https://leetcode.com/problems/product-of-array-except-self/description/
       
    }
}
