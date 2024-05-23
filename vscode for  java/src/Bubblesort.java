import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n =sc.nextInt();
     int[] arr= new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     sc.close(); 
     sortbub(arr);   
    }
    static void sortbub(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }

    }
}
