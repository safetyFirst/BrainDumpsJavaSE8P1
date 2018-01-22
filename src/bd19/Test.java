package bd19;

public class Test {

    void readCar(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        final Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);
        //ex.readCar(cardNo);
    }
}
