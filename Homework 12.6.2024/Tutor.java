// ika 22005669
//Riz Haikal Bin Jasri - 24000155

public class Tutor{
    private String phone;
    private String email;
    private String id;
    private String subject;

    public Tutor(String phone, String email, String id, String subject){
        this.phone = phone;
        this.email = email;
        this.id = id;
        this.subject = subject;
    }
    public String getTutorEmail(){
        return email;
    }
    public String getTutorId(){
        return id;
    }
    public String getTutorPhone(){
        return phone;
    }
    public String getTutorSubject(){
        return subject;
    }
    public static void printTutors(Tutor[] tutors){
        int index = 1;
        for(Tutor tutor : tutors){
            System.out.println(index+"."+tutor);
            index++;
        }
    }
    public String toString(){
        return "Tutor phone: "+phone+", Tutor email: "+email+", ID: "+id+", Subject: "+subject;
    }

}
