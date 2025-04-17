public class JavaSE_04 {
    public static void main(String[] args) {
        System.out.println(test1(3, 'a', 2.0, (short) 4));
        
    }
    // 表达式中，小范围的类型变量会自动提升为大范围的类型变量进行运算
    // 例如：byte,short,char会自动提升为int进行运算
    // int - long - float - double
    public static double test1(int a, char b, double c, short k){
        // byte,short,char会自动提升为int进行运算
        // int - long - float - double
        // 1. int + char + double + short
        // 2. int + double
        // 3. double
        return a + b + c + k;
    }
    public static int test2(byte a, byte b){
        // byte + byte = int
        // 1. byte + byte
        // 2. int
        return a + b;
    }
    public static int test3(byte a, short b){
        // byte + short = int
        // 1. byte + short
        // 2. int
        //强制转换为byte
        return (byte)(a + b);
    }
}
