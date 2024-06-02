//Riz Haikal Bin Jasri 24000155

import java.util.Scanner;

public class Tutors{
    private static String[] ListOfTutors = new String[10];

    public static void add(){
        System.out.println("Add Tutors: ");
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<ListOfTutors.length;i++){
            String TutorName = scanner.nextLine();
            ListOfTutors[i] = TutorName;
        }
    }

    public static void remove(){
        System.out.println("Which Tutor do you want to remove?");
        Scanner scanner=new Scanner(System.in);
        String StrTutorRemove = scanner.nextLine();
        int Tutorremove = Integer.parseInt(StrTutorRemove);
        ListOfTutors[Tutorremove-1]="";
    }

    public static void print(){
        int x=1;
        for(int i=0;i<ListOfTutors.length;i++){
            System.out.println( x + ") " +ListOfTutors[i]);
            x++;
        }
    }
}
