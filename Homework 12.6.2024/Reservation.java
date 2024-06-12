// Naziman_24000127

public class Reservation{
    private String date;
    private String time;
    private Name name;
    private Student student;
    private Tutor tutor;

    public Reservation(Name name, Student student, Tutor tutor, String date, String time) {
        this.date = date;
        this.time = time;
        this.student = student;
        this.tutor = tutor;
        this.name = name;
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

    public Name getName(){
        return name;
    }
    public Tutor getTutor(){

        return tutor;
    }
    public String toString() {
        return "\n{"+name+", "+student+", "+tutor+", Date: " + date + ", Time: "+time+'}';
    }
}
