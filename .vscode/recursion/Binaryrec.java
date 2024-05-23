import java.util.Scanner;
public class Binaryrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int ans = binary(nums, t, 0, nums.length - 1);
        System.out.println(ans);
    }
    public static int binary(int[] arr, int target, int l, int h) {
        if (l > h) {
            return -1;
        }
        int m = l + (h - l) / 2;
        if (target == arr[m]) {
            return m;
        }
        if (target < arr[m]) {
            return binary(arr, target, l, m - 1);
        }
        return binary(arr, target, m + 1, h);
    }
}

