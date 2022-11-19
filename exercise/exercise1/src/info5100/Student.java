package info5100;

import java.util.Arrays;
import java.util.Random;

public class Student {
    protected String name;
    protected byte[] list = new byte[15];


    public Student(String name) {
        this.name = name;

    }

    public byte[] getList() {
        return list;
    }

    public void grading(){
        Random rd = new Random();
        for(int i = 0;i<list.length;i++){
            int grade = rd.nextInt(20) + 80;
            list[i] = (byte)grade;
        }
        System.out.println(name +"'s grading is finished.");
    }

    public int total(){
        int grade = 0;
        for (int i = 0; i < 15; i++) {
            grade += (int)list[i];
        }
        return grade;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", list=" + Arrays.toString(list) ;
    }
}
