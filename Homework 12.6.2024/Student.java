//Muhammad Asyraf Arsyad bin Mohd Nazal 24000132

public class Student{
    private String email;
    private String phone;
    private String subject;
    private char gender;

    public Student(String email, String phone){
        this.email = email;
        this.phone = phone;
    }

    public Student(String email, String phone, String subject, char gender){
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.gender = gender;
    }

    public String getStudentEmail(){
        return email;
    }
    public String getStudentPhone(){
        return phone;
    }

    public String getStudentSubject(){
        return subject;
    }

    public char getStudentGender(){
        return gender;
    }
    
    
    public String toString(){
        return "Student Email: "+email+", Student Phone: "+phone;
    }

}
