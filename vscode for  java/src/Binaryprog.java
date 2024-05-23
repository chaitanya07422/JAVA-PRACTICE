 import java.util.Scanner;; 
 public class Binaryprog {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int t=sc.nextInt();      
          int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close(); ///close the scanner object 
      int  ans= binarysearch(nums,t);
       System.out.println(ans);
    }
    static int binarysearch(int[] nums,int  t){
        int start=0;
        int end=nums.length-1;
        int mid;   
        while(start<=end){
            mid=start+(end-start)/2;
            if(t<nums[mid]){
                end=mid-1;
            }
            else if(t>nums[mid])
            start=mid+1;
            else{
             return mid;
        }
    }
        return -1;
    }
}
