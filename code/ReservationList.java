//ika 22005669

import java.util.List;
import java.util.ArrayList;
public class ReservationList{
    private static List<Reservation> reservations = new ArrayList<>();
    public ReservationList(List<Reservation> list){
        reservations = list;
    }
    public static void addReservation(Reservation reservation) {
        if(reservation != null){
            reservations.add(reservation);
            System.out.println("Reservation added: " + reservation);
        }
    }

    public static void removeReservation(String email) {
        boolean found = false;
        for (Reservation reserve : reservations) {
            if (reserve.getStudent().getStudentEmail().equals(email) && email != null) {
                reservations.remove(reserve);
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Reservation removed for  " + email);
        } else {
            System.out.println("No reservation found to remove.");
        }
    }
    public static void printReservations() {
        System.out.println("Current reservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    public static void findReservation(String email) {
        boolean found = false;
        for (Reservation reservation : reservations) {
            if (reservation.getStudent().getStudentEmail().equals(email) && email != null) {
                System.out.println("Found reservation: " + reservation);
                found = true;
                break;
            }
        }
        if(found == false)
            System.out.println("No reservation found for student with " + email);
    }

}
