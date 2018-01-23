package bd23;

public class Hauptklasse {

    public static void main(String[] args) {
        int x = 100;
        int a = x++; // 100
        int b = ++x; // 102
        int c = x++; // 102
        int d = (a < b) ? (a < c) ? a: (b < c) ? b: c : 0;
        System.out.println(d);
    }
}
