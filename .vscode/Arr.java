import java.util.ArrayList;
public class Arr{
    public static void main(String[] args) {    
        int []arr ={ 1,2,3,3,4,5};
        int target =3;
        ArrayList<Integer> ans =findallindex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }
    static  ArrayList<Integer> findallindex(int [] arr,int target,int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(arr[index]);
        }
        return findallindex(arr, target, index+1, list);
    } 
}
//linearsearch