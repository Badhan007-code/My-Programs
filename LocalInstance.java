public class LocalInstance {
    int x=10;

    void show(){
        int y=20;
        System.out.println(x+y);
    }
        public static void main(String[] args) {
            LocalInstance obj= new LocalInstance();
            obj.show();
    }

    
}
