//ika 22005669

public class Student{
    private String email;
    private String phone;

    public Student(String email, String phone){
        this.email = email;
        this.phone = phone;
    }

    public String getStudentEmail(){
        return email;
    }
    public String getStudentPhone(){
        return phone;
    }
    public String toString(){
        return "Student Email: "+email+", Student Phone: "+phone;
    }

}