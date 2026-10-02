public class Student {
    String name;
    int id;
    Student( String name,int id){
        this.name=name;
        this.id=id;
    }
    public static void main(String[] args) {
        Student s1= new Student("Rahim", 101);
        Student s2= new Student("karim", 102);
          Student s3= new Student("jamal", 103);
          System.out.println(s1.name+""+ s1.id);
           System.out.println(s2.name+""+ s2.id);
           System.out.println(s3.name+""+ s3.id);
}
}