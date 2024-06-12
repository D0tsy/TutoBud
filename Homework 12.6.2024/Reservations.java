// ika 22005669

import java.util.ArrayList;
import java.util.Scanner;

public class Reservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tutor tutors[] = {
                new Tutor("Ika Asri","+600101001","1001","Object Oriented Programming"),
                new Tutor("Amir","+600101001","1002","Structural Programming"),
                new Tutor("Aliyu","+600101001","1003","Database Management System"),
                new Tutor("Abu-bkr","+600102009346","1004","Object Oriented Programming"),
        };
        while (true) {
            String email = null;
            System.out.println("Choose an option: \n1) Add Reservation \n2) Remove Reservation \n3) Print Reservations \n4) Find Reservation \n5) Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.println("Enter student first name:");
                    String studentFirstName = scanner.nextLine();
                    System.out.println("Enter student last name:");
                    String studentLastName = scanner.nextLine();
                    System.out.println("Enter student email:");
                    String studentEmail = scanner.nextLine();
                    System.out.println("Enter student phone number:");
                    String studentPhoneNumber = scanner.nextLine();

                    Name name = new Name(studentFirstName, studentLastName);
                    Student student = new Student(studentEmail,studentPhoneNumber);

                    Tutor.printTutors(tutors);

                    System.out.println("Enter the number of tutor:");
                    int index = scanner.nextInt()-1;
                    while(index > tutors.length-1){
                        System.out.println("Enter tutor ID:");
                        index = scanner.nextInt()-1;
                    }
                    scanner.nextLine();
                    System.out.println("Enter date (dd-mm-yyyy):");
                    String date = scanner.nextLine();
                    System.out.println("Enter time (hh:mm AM/PM):");
                    String time = scanner.nextLine();

                    ReservationList.addReservation(new Reservation(name, student, tutors[index], date, time));
                    break;
                case 2:
                    System.out.println("Enter student email:");
                    email = scanner.nextLine();
                    ReservationList.removeReservation(email);
                    break;
                case 3:
                    ReservationList.printReservations();
                    break;
                case 4:
                    System.out.println("Enter student email:");
                    email = scanner.nextLine();
                    ReservationList.findReservation(email);
                    break;
                case 5:
                    System.out.println("Already existed.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }
}
