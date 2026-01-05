package StudentPackage;

public class StudentInfo {
    int id;
    String name;
    int age;

    StudentInfo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void Display (){
            System.out.println("*-*-*-*-*-*- Student Details -*-*-*-*-*");
            System.out.println(" Student Id No -" + id);
            System.out.println(" Student Name  -" + name);
            System.out.println(" Student Age   -" + age);
            System.out.println ("*---------------END-------------------*");
    }
}

