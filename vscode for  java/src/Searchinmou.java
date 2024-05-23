import java.util.Scanner;

public class Searchinmou {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int t=sc.nextInt();      
          int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close(); // Close the Scanner object

      int  ans=binarysearch(arr,t);
       System.out.println(ans);
    }
    static int binarysearch(int[] arr,int  t){
        int start=0;
        int end=arr.length-1;
        int mid;   
        while(start<=end){
            mid=start+(end-start)/2;
            if(t<arr[mid]){
                end=mid-1;
            }
            else if(t>arr[mid])
            start=mid+1;
            else{
             return mid;
        }
    }
        return -1;
    }
}
