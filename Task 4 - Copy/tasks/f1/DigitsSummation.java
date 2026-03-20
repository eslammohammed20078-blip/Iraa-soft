public class DigitsSummation {
    private long x;
    private long y;
    public DigitsSummation(long x, long y) {
        this.x = x;
        this.y = y;
    }
    public long calculateSum() {
        long lastDigitN = x % 10;
        long lastDigitM = y % 10;

        return lastDigitN + lastDigitM;
    }
    public void printResult() {
        System.out.println(calculateSum());
    }
}