import java.util.Scanner;
public class Orderagnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); // Close the Scanner object

        int ans = order(arr, t);
        System.out.println(ans);
    }
    static int order(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == t) {
                return mid;
            }
            if (isAsc) {
                if (t < arr[mid]) {
                    end = mid - 1;
                } else if (t > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (t > arr[mid]) {
                    end = mid - 1;
                } else if (t < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}