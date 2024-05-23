public class Linearsearch {
    public static void main(String[] args) {
        int arr[]={ 1 ,2,4,5};
        int target=5;
        System.out.println(linearsearch(arr,target,0));
    }
    public static  int linearsearch(int [] arr,int target,int index){
        if(arr[index]==target) {
            return index;
        }
        if(index==arr.length){
            return -1;
        }
        return linearsearch(arr, target,index+1);
    }
}
