public class App {
    public static void main(String[] args) {
        for (int numberToPrint = 1; numberToPrint < 101; numberToPrint++) {
            if (numberToPrint % 3 == 0 && numberToPrint % 5 == 0) {
                System.out.println("Universo");
            } else if (numberToPrint % 3 == 0) {
                System.out.println("Uni");
            } else if (numberToPrint % 5 == 0) {
                System.out.println("Verso");
            } else {
                System.out.println(numberToPrint);
            }
        }

    }
}
