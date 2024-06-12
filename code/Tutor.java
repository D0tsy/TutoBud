//Riz Haikal Bin Jasri - 24000155

public class Tutor{
    private String name;
    private String phone;
    private String id;
    private String subject;

    public Tutor(String name, String phone, String id, String subject){
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.subject = subject;
    }
    public String getTutorName() {
        return name;
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
        return "Tutor Name: "+name+", Tutor Phone: "+phone+", ID: "+id+", Subject: "+subject;
    }

}
