public class Newpivot {
    public static void main(String[] args) {
        int []a={-1,1,0,-3,3};
        int []prefix=new int[a.length];
        prefix[0]=1;
        for (int i = 1; i < a.length; i++)
             {
                prefix[i]=prefix[i-1]*a[i-1];

             }
              for (int i = 0; i < prefix.length; i++) {
                System.out.println(prefix[i]+"eww");
             }
             int left=1;
             for (int i = a.length-1; i >=0; i--) {
               prefix[i]*=left;
               
                left*=a[i];
             }
             for (int i = 0; i < prefix.length; i++) {
                System.out.println(prefix[i]);
             }
    }
}
