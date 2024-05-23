import java.util.Scanner;
public class Operator {
        
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int size=sc.nextInt();
    int [] arr=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    dupl(arr);
   System.out.println(even(n));
   System.out.println(dupl(arr));
    }
    static boolean even(int n){
        return (n&1)==1; //doing and operator 
    }
public static int dupl(int[] arr){
    int unique=0;
    for(int i=0;i<arr.length;i++){
        unique=unique^arr[i]; //unique elemnt in the arry
        //if we xxor oper bewtween two same numbers it will be 0 and 0 xor with number answer will be number
    }
    return unique;
}
}
//any thing xor with operator become complement eg 1   0  =  1===> 0 converted into 1
// a<<1 =2a: a<<b =a*2^b leftshift
///right sgift a>>b=a/2^b;