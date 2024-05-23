import java.util.ArrayList;
//import java.util.Arrays;
public class Tcs {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 2, 1, 5};
        //int ans;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            result.add(arr[i]);
        }
        //result.get(3);
        result.add(4,5);
        if(result.contains(5)){
            result.add(10);
        }
        result.add(4);
        result.remove(1);
        result.remove(2);
        result.set(0,9);
        System.out.println(result);
        //System.out.println(result.add(3));
    }
}
