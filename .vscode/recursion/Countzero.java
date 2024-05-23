public class Countzero {
    public static void main(String[] args) {
        int num = 2309090;
        System.out.println(count(num));
    }
    static int count(int num) {
        return helper(num, 0);
    }
    static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        int rem = num % 10;
        if (rem == 0) {
            return helper(num / 10, c + 1);
        }
        return helper(num / 10, c);
    }
}
