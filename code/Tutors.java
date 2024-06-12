//Tutors class
//Riz Haikal Bin Jasri 24000155

import java.util.*;

public class Tutors{
    private ArrayList<String> ListOfTutors = new ArrayList<String>();;


    public void add(String nameAdd){
        ListOfTutors.add(nameAdd);
    }

    //remove tutor by name
    public void remove(String nameRem){
        ListOfTutors.remove(nameRem);
    }

    //remove tutor by number
    public void remove(int numRem){
        ListOfTutors.remove(numRem);
    }

    public void print(){
        System.out.println(ListOfTutors);
    }
}
