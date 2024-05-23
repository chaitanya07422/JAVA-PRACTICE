import java.util.Scanner;

public class Evendig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        sc.close(); // Close the Scanner object

        int ans= evendigits(arr);
        System.out.println(ans);
    }
    static int evendigits(int[] arr){
        int count=0;
        for(int num: arr){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10; 
        }
        return count % 2 == 0;
    }
}
