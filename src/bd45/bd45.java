package bd45;

import java.util.ArrayList;

public class bd45 {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;

        try {
            while (true) {
                myList.add("My String");
            }
        } catch (RuntimeException re) {
            System.out.println("Caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        } System.out.println("Ready to use");
    }
}
