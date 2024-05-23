public class Rotatedbinary {
  public static void main(String[] args) {
      int[] arr = {4,5,6,7,0,1,2};
      int ans = binary(arr, 0);
      System.out.println("Peak element is: " + ans);
  }
  static int binary(int[] arr, int target) {
      int pivot = findpeak(arr, 0, arr.length - 1);
      if (pivot == -1) {
          return binarysearch(arr, target, 0, arr.length - 1);
      }
      if (arr[pivot] == target) {
          return pivot;
      }
      if (target >= arr[0]) {
          return binarysearch(arr, target, 0, pivot - 1);
      }
      return binarysearch(arr, target, pivot + 1, arr.length - 1);
  }
  static int findpeak(int []arr,int start,int end){
    int  mid =start+(end-start)/2;
    while(start<=end){
    if( mid  <end &&arr[mid]>arr[mid+1]){
      return mid;
    }
    else if( start <mid && arr[mid]<arr[mid-1]){
      return mid-1;
    }
    else if(arr[start]<arr[mid]){
      start=mid+1;
    }
    else end=mid-1;{
  }
}
      return -1;
}
  static int binarysearch(int[] nums, int t, int start, int end) {
      while (start <= end) {
          int mid = start + (end - start) / 2;
          if (t < nums[mid]) {
              end = mid - 1;
          } else if (t > nums[mid]) {
              start = mid + 1;
          } else {
              return mid;
          }
      }
      return -1;
  }
}
