//Student class
//Muhammad Asyraf Arsyad bin Mohd Nazal 2400132

public class Student {
    private String Name;
    private int Age;
    private char Gender;
    private String academicInfo;
    private String Address;
    private String phoneNum;

    //setter & getter
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void setGender(char gender) {
        this.Gender = gender;
    }

    public char getGender() {
        return Gender;
    }

    public void set_academicInfo(String academicInfo) {
        this.academicInfo = academicInfo;
    }

    public String get_academicInfo() {
        return academicInfo;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void set_phoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String get_phoneNum() {
        return phoneNum;
    }
}
