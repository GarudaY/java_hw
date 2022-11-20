public class ex2 {
    public static void main(String[] args) {
        int[] arr1 = {2, 0, 1, 6, 7, 4, 8, 13};
        int[] arr2 = {20, 1, 0, 2, 55, 6, 7, 9};
        int[] result = diffNum(arr1, arr2);
        printArray(result);
    }
    public static int[] diffNum(int[] a, int[] b) {
        int sumArrCount = 0;
        int[] sum = new int[a.length + b.length];
        boolean test;

        for (int value : a) {
            test = false;
            for (int i : b) {
                if (value == i) {
                    test = true;
                }
            }
            if (!test) {
                sum[sumArrCount] = value;
                sumArrCount++;
            }
        }
        for (int value : b) {
            test = false;
            for (int i : a) {
                if (value == i) {
                    test = true;
                }
            }
            if (!test) {
                sum[sumArrCount] = value;
                sumArrCount++;
            }
        }
        return sum;
    }

    public static void printArray(int[] arrays) {
        for (int array : arrays) {
            System.out.print(array);
        }
        System.out.println();
    }
}
