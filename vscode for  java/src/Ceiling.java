import java.util.Scanner;
public class Ceiling {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int t=sc.nextInt();      
          int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close(); // Close the Scanner object

      int  ans= ceiling(arr,t);
       System.out.println(ans);
    }
    static int ceiling(int[] arr,int t){
        int start=0;
        int end=arr.length-1;
        if(t>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=t){
                end=mid-1;
            }
            else if(arr[mid]<t){
                start=mid+1;
            }
        else if(arr[mid]==t) {
            return arr[mid];
       }
    }
        return arr[start]; //when while loop start=end+1; end target start; at the  whiile loop
    }
}