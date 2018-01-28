package bd73;

public class App {

    String myStr = "7007";

    public void doStuff(String str) {
        int myNum = 0;

        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("9009");
    }
}
