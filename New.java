public class New {
    public static void main(String[] args) {
        int[] a={1,-1,0};
        int total =0;
        for (int i = 0; i < a.length; i++) {
            total+=a[i];
        }
        int left=0;
        for (int i = 0; i < a.length; i++) {
            int right=total-left-a[i];
            if(right==left){
                System.out.println(i);
                return;
            }
            left+=a[i];
        }
        System.out.println("-1");
        
    }
    
}
