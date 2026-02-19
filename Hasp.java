import java.util.HashSet;
import java.util.Scanner;
public class Hasp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        if(a%2!=0){
            System.out.println("wierd");
        }
       if(a==2||a==3||a==4||a==5){
 if(a%2==0){
                System.out.println("not weird");
            
       }}

    if(a>=6){
        for(int i=6;i<20;i++){
            if(i%2==0){
                System.out.println("weird");
                break;
            }
        }
    }
    if(a>20 && a%2==0){
        System.out.println("not weird");
    }
    }
}
