public class JavaSE_13 {
    public static void main(String[] args) {
        test();
        yearsToDouble();
    }
    public static void test(){
        int a = 1;
        while(a < 5){
            System.out.println("Hello World");
            a++;
        }
    }
    public static void yearsToDouble() {
        double principal = 1.0;
        double target = principal * 2;
        double rate = 0.017;
        int years = 0;
        while (principal < target) {
            principal *= (1 + rate);
            years++;
        }
        System.out.println("It takes " + years + " years to double the money at 1.7% compound interest.");
    }
}
