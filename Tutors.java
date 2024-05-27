import java.util.Scanner;

public class Tutors{
    private String[] ListOfTutors = new String[10];

    public void add(){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<ListOfTutors.length;i++){
            String TutorName = scanner.nextLine();
            ListOfTutors[i] = TutorName;
        }
    }
    public void remove(){

    }
    public void print(){
        for(int i=0;i<ListOfTutors.length;i++){
            System.out.println(ListOfTutors[i]);
        }
    }
}
