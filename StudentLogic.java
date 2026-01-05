package StudentPackage;
import java.util.ArrayList;
public class StudentLogic {
    ArrayList<StudentInfo> list = new ArrayList<>();
    void addStudent(StudentInfo s){
        for (StudentInfo si : list) {
            if (si.id == s.id) {
                System.out.println (" ID is Already exists !!! ");
                return;
            }
        }
    list.add(s);
    System.out.println (" + Student Added Successfully ");
}
void viewStudents (){
        if ( list.isEmpty()){
            System.out.println (" No Student found !! ");
        } else {
            for (StudentInfo s : list){
                s.Display();
            }
        }
    }
    void deleteStudent (int id){
        boolean found = false;
        for (StudentInfo s : list) {
            if (s.id == id) {
                list.remove(s);
                System.out.println (" Student Delete Successfully ");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println (" Student not found ");
        }
    }
}
