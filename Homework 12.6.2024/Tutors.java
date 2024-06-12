//Tutors class
//Riz Haikal Bin Jasri 24000155

import java.util.*;

public class Tutors{
    private ArrayList<Object> ListOfTutors = new ArrayList<Object>();


    public void add(Object Tutor){
        ListOfTutors.add(Tutor);
        System.out.println("Tutor added");
    }

    //remove tutor by name
    public void remove(Object Tutor){
        if(ListOfTutors.contains(Tutor)){
            ListOfTutors.remove(Tutor);
            System.out.println("Tutor removed");
        }
        else{
            System.out.println("Tutor not found");
        }
    }

    public void print(){
        System.out.println(ListOfTutors);
    }
}
