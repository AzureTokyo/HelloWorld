public class JavaSE_03 {
    public static void main(String[] args) {
        byte b = 10; // 1个字节
        www(b); // byte -> int
        // byte -> int
        int i = 100;
        www2(i); // int -> byte
        int m = 1000;
        byte n = (byte) m;
        System.out.println(n); // 1000 -> -112
        System.out.println(m); // 1000
        // 强制转换会导致数据益出，浮点数会保留整数部分返回
    }
    // 类型范围小的变量可以直接给大范围的变量赋值
    // 例如：byte -> short -> int -> long -> float -> double
    // 原理：为什么可以这样？
    // 因为byte在计算机占用1个字节，8位，int在计算机占用4个字节，32位
    public static void www(int i){
        System.out.println(i);
    }
    //强制转换
    // 例如：int -> short -> byte
    // 写一个方法演示强制转换
    public static void www2(int i){
        // 强制转换
        byte b = (byte) i; // 这里会有数据丢失
        System.out.println(b);
    }
}
