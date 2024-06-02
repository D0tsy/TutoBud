//Student class
//Muhammad Asyraf Arsyad bin Mohd Nazal 2400132

public class Student {
    private String studName = "Wagyu";
    private int studAge = 21;
    private char studGender = 'M';
    private String academicInfo = "COE";
    private String address = "UTP";
    private String phoneNum = "+601234";

    public void name(){
        System.out.println("Name: " + studName);
    }
    public void age(){
        System.out.println("Age: " + studAge);
    }
    public void gender(){
        System.out.println("Gender: " + studGender);
    }
    public void academic(){
        System.out.println("Academic info: " + academicInfo);
    }
    public void address(){
        System.out.println("Address: " + address);
    }
    public void contact(){
        System.out.println("Contact number: " + phoneNum);
    }
}
