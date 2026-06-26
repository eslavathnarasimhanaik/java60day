 package Day02;


class Student {
    String name;
    int rollno;
    int  age;
    String  dept;

    Student(String name,int rollno,int age,String dept ){
        this.name  = name;
        this.rollno = rollno;
        this.age = age;
        this.dept = dept;

    }

    void  display(){
        System.out.println(name +"name");
    }
    void study(){
        System.out.println(rollno +"rollno");
    }
    public static void main(String[] args) {
        
        Student s = new Student("naik", 233, 0, null);
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println(s.age);
        System.out.println(s.dept);
        s.display();
        s.study();
        
    }

}
