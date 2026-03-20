public class Summation {

    private long x;

    public Summation(long x) {
        this.x = x;
    }

    public long calculateSum() {
        return x * (x + 1) / 2;
    }

    public void printResult() {
        System.out.println(calculateSum());
    }
}