public class Squarebin {
    public static void main(String[] args) {
        int n =110;
        int p=3;
        System.out.println(sqrt(n,p));
    }
    public static double sqrt(int n,int p){
        int s=0;
        int e=n-1;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        double inc =0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root=root+inc;
            }
            root-=inc;
            inc/=10;
        }
       return root;
    }
}
