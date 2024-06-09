//ika 22005669

public class Student{
    private String name;
    private String email;
    private String phone;

    public Student(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getStudentName() {
        return name;
    }
    public String getStudentEmail(){
        return email;
    }
    public String getStudentPhone(){
        return phone;
    }
    public String toString(){
        return "Student Name: "+name+", Stud" +
                "ent Email: "+email+", Student Phone: "+phone;
    }
}