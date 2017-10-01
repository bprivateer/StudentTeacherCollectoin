import java.util.*;

public class Main {
    public static void main(String[] args){


        List<Student> studentList = new ArrayList<>();
//
//        for (int i = 0; i < 15; i ++){
//            studentList.add(student.)
//        }

        Student student1 = new Student("paul", "paul", 1, 1);
        studentList.add(student1);
        Student student2 = new Student("paul", "paul", 2, 1);
        studentList.add(student2);
        Student student3 = new Student("paul", "paul", 3, 1);
        studentList.add(student3);
        Student student4 = new Student("paul", "paul", 4, 1);
        studentList.add(student4);
        Student student5 = new Student("paul", "paul", 5, 1);
        studentList.add(student5);
        Student student6 = new Student("paul", "paul", 6, 1);
        studentList.add(student6);
        Student student7 = new Student("paul", "paul", 7, 1);
        studentList.add(student7);
        Student student8 = new Student("paul", "paul", 8, 1);
        studentList.add(student8);
        Student student9 = new Student("paul", "paul", 9, 1);
        studentList.add(student9);
        Student student10 = new Student("paul", "paul", 10, 1);
        studentList.add(student10);
        Student student11 = new Student("paul", "paul", 11, 1);
        studentList.add(student11);
        Student student12 = new Student("paul", "paul", 12, 1);
        studentList.add(student12);
        Student student13 = new Student("paul", "paul", 13, 1);
        studentList.add(student13);
        Student student14 = new Student("paul", "paul", 14, 1);
        studentList.add(student14);
        Student student15 = new Student("paul", "paul", 15, 1);
        studentList.add(student15);

        List<Teacher> teacherList = new ArrayList<>();

        Teacher teacher1 = new Teacher("Betty", "thompson", 1,1);
        teacherList.add(teacher1);
        Teacher teacher2 = new Teacher("Betty", "thompson", 2,1);
        teacherList.add(teacher2);
        Teacher teacher3 = new Teacher("Betty", "thompson", 3,1);
        teacherList.add(teacher3);

        Set<Student> studentSet1 = new HashSet<>();
        studentSet1.add(student1);
        studentSet1.add(student2);
        studentSet1.add(student3);
        studentSet1.add(student4);
        studentSet1.add(student5);

        Set<Student> studentSet2 = new HashSet<>();
        studentSet1.add(student6);
        studentSet1.add(student7);
        studentSet1.add(student8);
        studentSet1.add(student9);
        studentSet1.add(student10);

        Set<Student> studentSet3 = new HashSet<>();
        studentSet1.add(student11);
        studentSet1.add(student12);
        studentSet1.add(student13);
        studentSet1.add(student14);
        studentSet1.add(student15);

        Map<Teacher, Set<Student>> studentTeacherMap = new HashMap<>();
        studentTeacherMap.put(teacher1, studentSet1);
        studentTeacherMap.put(teacher2, studentSet2);
        studentTeacherMap.put(teacher3, studentSet3);

        System.out.println("Teachers: ");
        for(Teacher teachers: studentTeacherMap.keySet()){
            System.out.println(teachers);

        }

        System.out.println("Students");
        for(Set<Student> students: studentTeacherMap.values()){
            System.out.println(students);
        }








    }
}
