public class MinMaxValOfArray {
    public static void main(String[] args) {
        int[] arr = {-1444, 2232, 333, 354, 533, 62, 7333, 82, 92, 110, 6666, -5, 443, 344353535, -44444};
        System.out.println(maxValueOfArray(arr));
        System.out.println(minValueOfArray(arr));

    }

    public static int minValueOfArray(int[] array) {
        int number = Integer.MAX_VALUE;
        for (int currentVal : array) {
            if (currentVal < number) {
                number = currentVal;
            }
        }
        return number;
    }

    public static int maxValueOfArray(int[] array) {
        int number = Integer.MIN_VALUE;
        for (int currentVal : array) {
            if (currentVal > number) {
                number = currentVal;
            }
        }
        return number;
    }

    public void test() {
 }
}
