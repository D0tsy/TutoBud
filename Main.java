public class Main {
    public static void main(String[] args) {

        //Student - Muhammad Asyraf Arsyad
        Student sInfo = new Student();
        sInfo.name();
        sInfo.age();
        sInfo.gender();
        sInfo.academic();
        sInfo.address();
        sInfo.contact();

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
        tutors.add();
        tutors.remove();
        tutors.print();

    }
}

