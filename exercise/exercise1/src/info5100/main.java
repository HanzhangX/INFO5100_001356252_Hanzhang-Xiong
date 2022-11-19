package info5100;

public class main {
    public static void main(String[] args) {
        Student s1 = new Part_time("Lily");
        Student s2 = new Part_time("Lucy");
        Student s3 = new Part_time("Potter");
        Student s4 = new Part_time("Tony");
        Student s5 = new Part_time("Tom");
        Student s6 = new Part_time("Dan");
        Student s7 = new Part_time("Peter");
        Student s8 = new Part_time("France");
        Student s9 = new Part_time("White");
        Student s10 = new Part_time("Bruce");
        Full_time s11 = new Full_time("fLily");
        Full_time s12 = new Full_time("fLucy");
        Full_time s13 = new Full_time("fPotter");
        Full_time s14 = new Full_time("fTony");
        Full_time s15 = new Full_time("fTom");
        Full_time s16 = new Full_time("fDan");
        Full_time s17 = new Full_time("fPeter");
        Full_time s18 = new Full_time("fFrance");
        Full_time s19 = new Full_time("fWhite");
        Full_time s20 = new Full_time("fBruce");

        s1.grading();
        s2.grading();
        s3.grading();
        s4.grading();
        s5.grading();
        s6.grading();
        s7.grading();
        s8.grading();
        s9.grading();
        s10.grading();
        s11.regrading();
        s12.regrading();
        s13.regrading();
        s14.regrading();
        s15.regrading();
        s16.regrading();
        s17.regrading();
        s18.regrading();
        s19.regrading();
        s20.regrading();

        Session info5100 = new Session();
        info5100.addStudent(s1);
        info5100.addStudent(s2);
        info5100.addStudent(s3);
        info5100.addStudent(s4);
        info5100.addStudent(s5);
        info5100.addStudent(s6);
        info5100.addStudent(s7);
        info5100.addStudent(s8);
        info5100.addStudent(s9);
        info5100.addStudent(s10);
        info5100.addStudent(s11);
        info5100.addStudent(s12);
        info5100.addStudent(s13);
        info5100.addStudent(s14);
        info5100.addStudent(s15);
        info5100.addStudent(s16);
        info5100.addStudent(s17);
        info5100.addStudent(s18);
        info5100.addStudent(s19);
        info5100.addStudent(s20);



        System.out.println("=====================================");

        System.out.println("Create public methods to calculate average quiz scores per student for the whole class");
        info5100.getAverage();

        System.out.println("=====================================");

        System.out.println("Create public method to print the list of quiz scores in ascending order");
        info5100.sortGrade(1);
        for (int i = 1; i < 20 ; i++) {
            System.out.println(info5100.getStulist().get(i));
        }



        System.out.println("=====================================");

        System.out.println("Create public method to print names of part-time students");
        info5100.getPart_time();

        System.out.println("=====================================");

        System.out.println("Create public method to print exam scores of full-time students");
        info5100.getFull_time();





    }
}
