public class Main {
    public static void main(String[] args) {



        //Students - Wan Muhammad Adib Shahmi
        Students students = new Students();
        students.addstudent();
        students.removestudent();
        students.printstudent();
        students.findstudent();

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

