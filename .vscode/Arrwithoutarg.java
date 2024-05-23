import java.util.ArrayList;

public class Arrwithoutarg {
 public static void main(String[] args) {
    int [] arr={ 1,2,3,4,5,6};
    int target =4;
    ArrayList<Integer> ans = findindex(arr,target,0);
    System.out.println(ans);
 }   
 static ArrayList<Integer> findindex(int [] arr,int target,int index){
    ArrayList<Integer> list =new ArrayList<>();
     if(index==arr.length){
    return list;
    }
// this will contain anss for that funn call only creates  list for every call
     if(arr[index]==target){
    list.add(arr[index]);
    }
    ArrayList<Integer> ansfrombelowcalls =findindex(arr, target, index+1);
    list.addAll(ansfrombelowcalls);
    return list;

 }
}
