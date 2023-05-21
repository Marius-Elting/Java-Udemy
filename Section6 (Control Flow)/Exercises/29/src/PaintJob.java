import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        int result = getBucketCount(1.22, 3.11, 2.5, 0);
        System.out.println(result);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int exraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || exraBuckets < 0) {
            return -1;
        }
        double squareMeters = width * height;
        System.out.println(squareMeters);
        double neededBuckets = Math.ceil(squareMeters / areaPerBucket);
        System.out.println(neededBuckets);
        return (int) Math.ceil((int) neededBuckets - (int) exraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double squareMeters = width * height;
        System.out.println(squareMeters);
        double neededBuckets = Math.ceil(squareMeters / areaPerBucket);
        System.out.println(neededBuckets);
        return (int) neededBuckets;
    }

    public static int getBucketCount(double squareMeters, double areaPerBucket) {
        if (squareMeters <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        System.out.println(squareMeters);
        double neededBuckets = Math.ceil(squareMeters / areaPerBucket);
        System.out.println(neededBuckets);
        return (int) neededBuckets;
    }

}
