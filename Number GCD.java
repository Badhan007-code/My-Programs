public class Number GCD {
    public static void main (String[]args){
        int a= 12;
        int b=19;
        while (b !=0){
            temp= b;
            b= a% b;
            a = temp;
        }
        System.out.println("GCD" = + a);
    }

    
}