import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        sc.close(); // Close the Scanner object
        int ans = linearsearch(arr, t);
        System.out.println(ans);
        System.out.println(min(arr));
    }
    static int linearsearch(int[] arr, int t) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<ans) {
                ans=arr[i];
            }
        }
        return ans;
        }
}
