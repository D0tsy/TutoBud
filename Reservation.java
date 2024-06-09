// ika 22005669

public class Reservation{
    private String date;
    private String time;
    private Student student;
    private Tutor tutor;

    public Reservation(Student student, Tutor tutor, String date, String time) {
        this.date = date;
        this.time = time;
        this.student = student;
        this.tutor = tutor;
    }

    public String getDate() {

        return date;
    }

    public String getTime() {

        return time;
    }
    public Student getStudent(){

        return student;
    }
    public Tutor getTutor(){

        return tutor;
    }
    public String toString() {
        return "\n{"+student+", "+tutor+", Date: " + date + ", Time: "+time+'}';
    }
}
