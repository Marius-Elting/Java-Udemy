
public class LargestPrime {
    public static void main(String[] args) {
        int result = getLargestPrime(21);
        System.out.println(result);
        int result2 = getLargestPrime(217);
        System.out.println(result2);
        int result3 = getLargestPrime(-21);
        System.out.println(result3);
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int primer = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
                if (count == 2)
                    primer = i;
            }
        }

        return primer;
    }

}
