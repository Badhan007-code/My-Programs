import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int Password;
        do {
            System.out.println("Enter password");
            Password= sc.nextInt();
        } while (Password != 1234);  
        System.out.println("right password");
    }
    
}
