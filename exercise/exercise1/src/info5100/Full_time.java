package info5100;

import java.util.Arrays;
import java.util.Random;

public class Full_time extends Student{

    public byte[] relist = new byte[15];

    public Full_time(String name) {
        super(name);
    }

    public void regrading(){
        Random rd = new Random();
        for(int i = 0;i<relist.length;i++){
            int grade = rd.nextInt(20) + 80;
            relist[i] = (byte)grade;

        }
        System.out.println(name +"'s grading is finished.");
    }

    public byte[] getRelist() {
        return relist;
    }



    public int total(){
        int grade = 0;
        for (int i = 0; i < 15; i++) {
            grade += (int)relist[i];
        }
        return grade;
    }


    @Override
    public String toString() {
        return name +
                "relist=" + Arrays.toString(relist)
                ;
    }
}
