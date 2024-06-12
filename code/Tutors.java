//Tutors class
//Riz Haikal Bin Jasri 24000155

import java.util.*;

public class Tutors{
    private ArrayList<String> ListOfTutors = new ArrayList<String>();


    public void add(String nameAdd){
        ListOfTutors.add(nameAdd);
        System.out.println("Tutor added");
    }

    //remove tutor by name
    public void remove(String nameRem){
        if(ListOfTutors.contains(nameRem)){
            ListOfTutors.remove(nameRem);
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