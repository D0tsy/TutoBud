public class Main {
    public static void main(String[] args) {

        //Students - Wan Muhammad Adib Shahmi
        Students students = new Students();
        students.addstudent("abu");
        students.addstudent("ali");
        students.removestudent("amin");
        students.printstudent();
        students.findstudent("abu");

        Tutor Adam = new Tutor("+601236547" , "Adam@gmail.com" , "1001", "Object Oriented Programming");

        //Tutors = Riz Haikal Bin Jasri
        Tutors tutors = new Tutors();

        tutors.add(Adam);
        tutors.print();
        tutors.remove(Adam);
        tutors.print();
    }
}

