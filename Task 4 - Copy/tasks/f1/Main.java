import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long x = input.nextLong();
        long y = input.nextLong();

        DigitsSummation ds = new DigitsSummation(x, y);

        ds.printResult();

    }
}