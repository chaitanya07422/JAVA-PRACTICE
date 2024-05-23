import java.util.Arrays;
import java.util.Scanner;
public class Selectionsor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); // Close the Scanner object
        selecsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selecsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getmax(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getmax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
