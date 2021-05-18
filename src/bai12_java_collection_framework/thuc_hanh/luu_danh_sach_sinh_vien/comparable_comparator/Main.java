package bai12_java_collection_framework.thuc_hanh.luu_danh_sach_sinh_vien.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Binh", 38, "HT");
        Student student4 = new Student("An", 38, "HT");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        Collections.sort(lists, new AgeComparator());
        System.out.println(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
