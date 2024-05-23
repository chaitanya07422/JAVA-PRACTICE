import java.util.Scanner;
public class Leetcode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int target=sc.nextInt();      
          int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();  

      int  ans1= twonums(nums,target);
       System.out.println(ans1);  
    }
    static int twonums(int[] nums,int  target){
        int start=0;
        int end=nums.length-1;
        int mid;   
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid])
            start=mid+1;
            else{
                return mid;

            }
    }
        return -1;
    }
}