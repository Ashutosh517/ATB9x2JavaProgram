package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class Lab163_Static {
    public static void main(String[] args) {
      //  Student s1 = new Student();
       // s1.age;
        Student s1 = new Student(23);
        Student s2 = new Student(33);

        System.out.println(Student.school_name);
        Student.school_name ="ZYZ";
        System.out.println(Student.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);

    //   System.out.println(Student.age);
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//        Student s4;


    }
}

class Student{
    int age = 123 ; // Non static variable // Instance Variable
    static String school_name = "ABC"; // Static Variable

    public Student(int age) {
        this.age = age;
    }

    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to");
        System.out.println("Read a MySQL db()");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loded Once,When Class is Loaded");
        System.out.println("Read the excel File!");
    }



}
