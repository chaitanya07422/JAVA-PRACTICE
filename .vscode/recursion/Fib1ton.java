import java.util.Scanner;

public class Fib1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        fib(n);
    }
    static  void fib(int n){
        if (n==0){
            
            return;
        }
        
        else{
            fib(n-1);
            System.out.println(n);
            
        }
    }

}
