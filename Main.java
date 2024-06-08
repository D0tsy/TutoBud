public class Main {
    public static void main(String[] args) {

        //Students - Wan Muhammad Adib Shahmi
        Students students = new Students();
        students.addstudent();
        students.removestudent();
        students.printstudent();
        students.findstudent();

        //Tutor = Riz Haikal Bin Jasri]
        Tutor tInfo = new Tutor();
        tInfo.name();
        tInfo.rate();
        tInfo.academics();
        tInfo.specialization();
        tInfo.reservations();

        //Tutors = Riz Haikal Bin Jasri
        Tutors tutors = new Tutors();
        tutors.add("Test");
        tutors.add("Test1");
        tutors.print();
        tutors.remove("Test1");
        tutors.print();
        tutors.remove(0);
        tutors.print();

    }
}

