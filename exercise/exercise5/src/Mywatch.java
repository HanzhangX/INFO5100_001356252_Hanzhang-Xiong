public class Mywatch {

    private static Mywatch mw = new Mywatch();

    private Mywatch(){

    }

    public static Mywatch getInstance(){
        return mw;
    }

    public void work(){
        System.out.println("tik tok");
    }
}
