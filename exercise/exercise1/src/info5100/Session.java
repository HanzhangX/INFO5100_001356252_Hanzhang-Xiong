package info5100;


import java.util.*;

public class Session {

    private List<Student> stulist = new ArrayList<>();

    public Session() {

    }
    public void addStudent(Student s){
        stulist.add(s);
    }

    public void getAverage(){

        for(int i = 0; i < 19;i++){
            int average = 0;
            if(stulist.get(i) instanceof Part_time){
                average = stulist.get(i).total() / 15;
                System.out.println(stulist.get(i).name +"'s average grade is " + average);
            }else{
                average = stulist.get(i).total() / 15;
                System.out.println(stulist.get(i).name +"'s average grade is " + average);
            }

        }
    }

    public void sortGrade(int n){
        Collections.sort(stulist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                byte s1 = 0;
                byte s2 = 0;
                if(o1 instanceof Part_time){
                    s1 = o1.list[n -1];

                }else if(o1 instanceof Full_time){
                    s1 = ((Full_time) o1).relist[n -1];
                }

                if(o2 instanceof Part_time){
                    s2 = o2.list[n-1];

                }else if(o2 instanceof Full_time){
                    s2 = ((Full_time) o2).relist[n-1];
                }
                if(s1 >= s2){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        System.out.println("Ascending order base the " + n  + "th grade.");
    }


    public void getPart_time(){
        for (int i = 0; i < 20; i++) {
            if(stulist.get(i) instanceof Part_time){
                System.out.println(stulist.get(i).name + " is a part-time student.");
            }else{
                continue;
            }
        }
    }

    public void getFull_time(){
        for (int i = 0; i < 20; i++) {
            if(stulist.get(i) instanceof Full_time){
                System.out.println(stulist.get(i).toString());

            }else{
                continue;
            }
        }
    }

    public List<Student> getStulist() {
        return stulist;
    }
}
