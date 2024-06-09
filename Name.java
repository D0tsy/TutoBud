//Muhammad Asyraf Arsyad bin Mohd Nazal 24000132

public class Name {
    private String fName;
    private String lName;

    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String toString(){
        return "Student Name: "+ fName + " " + lName;
    }
}
