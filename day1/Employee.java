package day1;
public class Employee {
    String name = "naik";
    int id = 28;
    int salary = 5000;
    String department = "software eng";

    void work(){
        System.out.println("working running");
    }
    void attendMeeting(){
        System.out.println("attend running");
    }
    void takeLeave(){
        System.out.println("take leave running");
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.name);
        System.out.println(e.id);
        System.out.println(e.salary);
        System.out.println(e.department);
        e.work();
        e.attendMeeting();
        e.takeLeave();
    }
}
