package bai5_accessmoifiler_staticmothed_staticproperty.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
