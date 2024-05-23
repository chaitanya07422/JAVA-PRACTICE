import java.util.Arrays;
import java.util.Scanner;

public class Cyclicsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); 
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i]-1;
            if (arr[i] != arr[correctindex]) {
                swap(arr, i, correctindex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
}
}
