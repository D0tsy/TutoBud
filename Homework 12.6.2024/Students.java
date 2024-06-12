//Wan Muhammad Adib Shahmi Bin Wan Mohd Shukri 24000495
import java.util.ArrayList;

public class Students {
    private ArrayList<Object> studentlist = new ArrayList<Object>();

    public void addstudent(Object Student) {
        studentlist.add(Student);
        System.out.println("Student Added");
    }

    public void removestudent(Object Student) {
        if (studentlist.contains(Student)) {
            studentlist.remove(Student);
            System.out.println("Student Removed");
        } else {
            System.out.println("Student Not Found");
        }
    }

    public void printstudent() {
        System.out.println("List of Students: " +studentlist);
    }

    public void findstudent(Object Student) {
        if (studentlist.contains(Student)) {
            System.out.println("Student Found");
        }
        else {
            System.out.println("Student Not Found");
        }
    }
}
