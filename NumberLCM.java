import java.util.Scanner;

public class NumberLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= 12;
        int b= 18;
        int gcd= 1;
        for(int i= 1; i<=a && i<=b; i++){

            if (a % 1 == 0 && b % 1== 0) {
                gcd = 1;
                
            }

        }
        int Icm= (a * b) / gcd;
        System.out.println("LCM =" + Icm);
    }
    
}
