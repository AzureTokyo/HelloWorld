public class JavaSE_12 {
    public static void main(String[] args){
        test1();
        int n = 100;
        sum(n);
        System.out.println("1到" + n + "的和为：" + sum(n));
    }
    // 目标：掌握for循环的使用，用一个方法
    public static void test1(){
        for (int i =1; i < 5; i++){
            System.out.println("hello world");
        }
    }
    //目标2: 写一个方法满足求和1+2+....n
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
