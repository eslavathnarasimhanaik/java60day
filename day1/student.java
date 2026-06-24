package day1;
public class student {

    String name = "naik";
    int  age = 23;
    int  rollno = 2575;
    String department = "cse";
        
    


    void study(){
        System.out.println("student is studing");
    }
    void attendClass(){
        System.out.println("Student is attending class");

    }
    void submitAssignment(){
        System.out.println("Student submittent assignment");

    }
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.rollno);
        System.out.println(s.department);
        s.study();
        s.attendClass();
        s.submitAssignment();
    }

}