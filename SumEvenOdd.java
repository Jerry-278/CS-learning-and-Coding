public class SumEvenOdd {
    public SumEvenOdd() {
        calculateSums();
    }

    public void calculateSums() {
        int n = 1;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
            n++;
        } while (n <= 100);

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }

    public static void main(String[] args) {
        new SumEvenOdd();
    }

}
