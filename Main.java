package StudentPackage;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLogic logic = new StudentLogic();
        while (true) {
            try {
                System.out.println("*-*-- Student Management System --*-*");
                System.out.println(" 1) Add Student ");
                System.out.println(" 2) View Student ");
                System.out.println(" 3) Delete Student ");
                System.out.println(" 4) Exit ");
                System.out.println("------------------------------------");
                System.out.println (" Enter choice ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(" Enter Student ID ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println(" Enter Student Name ");
                        String name = sc.nextLine();
                        System.out.println(" Enter Student Age ");
                        int age = sc.nextInt();
                        StudentInfo s = new StudentInfo(id, name, age);
                        logic.addStudent(s);
                        break;
                    case 2:
                        logic.viewStudents();
                        break;
                    case 3:
                        System.out.println(" Enter Id To Delete ");
                        int deleteId = sc.nextInt();
                        logic.deleteStudent(deleteId);
                        break;
                    case 4:
                        System.out.println(" Thank You Using....");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println(" Invalid Choice !");
                }
            } catch (Exception e) {
                System.out.println(" Please enter number only! ");
                sc.next();
            }
        }

    }
}

