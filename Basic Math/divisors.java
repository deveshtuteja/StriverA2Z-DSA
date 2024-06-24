public class divisors {
    public static void divisor(int n) {
        int count = 0;
        int sumOfDivisors = 0;
        if (n < 0) {
            System.out.println("invalid");
        }
        for (int div = 1; div <= Math.sqrt(n); div++) {
            if (n % div == 0) {
                count++;
                sumOfDivisors += div;
                System.out.print(div + " ");
                if (n / div != div) {
                    count++;
                    sumOfDivisors += n / div;
                    System.out.print(n / div + " ");
                }
            }

        }
        System.out.println();
        System.out.println("the no. of divisors are: " + count);
        System.out.println("the sum of divisors is:" + sumOfDivisors);
    }

    public static void main(String[] args) {
        divisor(2);
    }
}
