//Student class
//Muhammad Asyraf Arsyad 2400132

public class Student {
    private String studName = "Wagyu";
    private int studAge = 21;
    private char studGender = 'M';
    private String academicInfo = "COE";
    private String address = "UTP";
    private String phoneNum = "+601234";

    public void name(){
        System.out.println(studName);
    }
    public void age(){
        System.out.println(studAge);
    }
    public void gender(){
        System.out.println(studGender);
    }
    public void academic(){
        System.out.println(academicInfo);
    }
    public void address(){
        System.out.println(address);
    }
    public void contact(){
        System.out.println(phoneNum);
    }
}
