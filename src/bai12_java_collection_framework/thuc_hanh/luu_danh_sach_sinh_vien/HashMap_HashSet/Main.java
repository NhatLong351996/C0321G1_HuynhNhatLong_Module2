package bai12_java_collection_framework.thuc_hanh.luu_danh_sach_sinh_vien.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",19,"HN");
        Student student2 = new Student("Hung",20,"DN");
        Student student3 = new Student("Ha",19,"HP");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(4,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(3,student1);
        System.out.println(studentMap.entrySet());
        /*Set<Integer> set = studentMap.keySet();*/
        for (Integer key:studentMap.keySet()){
            System.out.println(key+" "+studentMap.get(key));
        }
        for (Map.Entry<Integer,Student> entry :studentMap.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
