public class Pivot {
    public static void main(String[] args) {
        int []a={1,7,3,6,5,6};
     int sum=0;
     for (int i = 0; i < a.length; i++) {
         sum+=a[i];
     }
     int left=0;
     for (int i = 0; i < a.length; i++) {
        int right=sum-left-a[i];
        if(right==left){
            System.out.println(a[i]);
        }
        left+=a[i];
     }

    }
}
