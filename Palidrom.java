import java.util.Scanner;

public class Palidrom {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int tem= n;
        int rev= 0;
        while (n !=0) {
            rev= rev*10+ n% 10;
            n= n/10;

            
        }
        if (tem== rev) {
            System.out.println("palidrom");
         } else{
            System.out.println("Not palidrom"); 
         }
        }
    }
    

