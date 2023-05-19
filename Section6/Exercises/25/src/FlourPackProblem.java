
public class FlourPackProblem {
    public static void main(String[] args) {
        boolean result = canPack(4, 18, 19);
        System.out.print(result);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Big Count = 5kg
        // Small Count = 1kg
        // Goal = amount of kg needed to assemble a package

        // big count + small count = goal

        if (bigCount * 5 + smallCount >= goal) {

            while (bigCount > 0) {

                if (goal - 5 < 0) {
                    bigCount -= 1;
                } else {
                    bigCount -= 1;
                    goal -= 5;
                }
                if (goal == 0) {
                    return true;
                }
            }

            while (smallCount > 0) {
                smallCount -= 1;
                goal -= 1;
                if (goal == 0) {
                    return true;
                }
            }

            if (goal < 0 || goal > 0) {
                return false;
            }

        } else {
            return false;
        }

        return false;

    }
}
