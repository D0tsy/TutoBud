import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student sInfo = new Student();
        sInfo.name();
        sInfo.age();
        sInfo.gender();
        sInfo.academic();
        sInfo.address();
        sInfo.contact();

        //Students - Wan Adib
        Students students = new Students();
        students.addstudent();
        students.removestudent();
        students.printstudent();
        students.findstudent();

        //Tutors test
        int x=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1. add tutors");
            System.out.println("2. print tutors");
            System.out.println("3. remove Tutor");
            System.out.println("4. exit");

            String choice = sc.nextLine();

            switch(choice){
                case "1":
                    Tutors.add();
                    break;

                case "2":
                    Tutors.print();
                    break;

                case "3":
                    Tutors.remove();
                    break;

                case "4":
                    x=1;
                    break;

                default:
                    break;
            }
        }while (x!=1);
    }
}

