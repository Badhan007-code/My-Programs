import java.util.Scanner;

public class DecmalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while (n>0) {
            System.out.println(n%2);
            n=n/2;
            
        }
    }
    
}
