public class Main {

    //1
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 6, 7, 4};
        int[] b = {20, 1, 33, 2, 55};
        int[] e = new int[a.length + b.length];

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            e[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            e[count++] = b[j];
        }
        for (int i = 0; i < e.length; i++)
            System.out.print(e[i] + " ");
    }

}