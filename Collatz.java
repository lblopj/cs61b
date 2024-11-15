public class Collatz {
    /*计算数字n的下一个数*/
    public static int nextnum(int n){
        if(n == 1) {
            return 1;
        }
        else if(n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void main(String[] args){
        int x = 5;
        while(x != 1){
            System.out.println(x + " ");
            x = nextnum(x);
        }
        System.out.println(x + " ");
    }
}
