package Day02;

public class Employee {
    int empid;
    String empname;
    String  department;
    double  salary;

    Employee(int empid,String empname,String department,double salary){
        this.empid =empid;
        this.empname = empname;
        this.department = department;
        this.salary=salary;

    }
    void display(){
        System.out.println("emplayee running ");
    }
    void  work(){
        System.out.println("working running");

    }
    public static void main(String[] args) {
        Employee e = new Employee(0, null, null, 0);
        System.out.println(e.empid);
        System.out.println(e.empname);
        System.out.println(e.department);
        System.out.println(e.salary);
        e.display();
        e.work();
        
    }


}