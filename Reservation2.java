//reservation class
//Nur Atiekah Izzatie 22005669

public class Reservation2 {
    private String studentName;
    private String studentEmail;
    private String studentPhoneNumber;
    private String tutorName;
    private String tutorPhoneNumber;
    private String tutorId;
    private String tutorSubject;
    private String date;
    private String time;

    public Reservation2(String studentName, String studentEmail, String studentPhoneNumber, String tutorName, String tutorPhoneNumber, String tutorId, String tutorSubject, String date, String time) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhoneNumber = studentPhoneNumber;
        this.tutorName = tutorName;
        this.tutorPhoneNumber = tutorPhoneNumber;
        this.tutorId = tutorId;
        this.tutorSubject = tutorSubject;
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
        return "Reservation{" +
                "studentName='" + studentName + ''' +
        ", studentEmail='" + studentEmail + ''' +
        ", studentPhoneNumber='" + studentPhoneNumber + ''' +
        ", tutorName='" + tutorName + ''' +
        ", tutorPhoneNumber='" + tutorPhoneNumber + ''' +
        ", tutorId='" + tutorId + ''' +
        ", tutorSubject='" + tutorSubject + ''' +
        ", date='" + date + ''' +
        ", time='" + time + ''' +
        '}';
    }
}


/*
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
*/
