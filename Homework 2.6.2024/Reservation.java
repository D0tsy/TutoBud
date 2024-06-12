//reservation class
//Nur Atiekah Izzatie 22005669

public class reservation {
    private String studentName;
    private String tutorName;
    private String date;
    private String time;

    public reservation(String studentName, String tutorName, String date, String time) {
        this.studentName = studentName;
        this.tutorName = tutorName;
        this.date = date;
        this.time = time;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    
    public String toString() {
        return "Reservation [Student: " + studentName + ", Tutor: " + tutorName + 
               ", Date: " + date + ", Time: " + time + "]";
    }
}
