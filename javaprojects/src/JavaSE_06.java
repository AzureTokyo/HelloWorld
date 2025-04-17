public class JavaSE_06 {
    public static void main(String[] args) {
        //目标：搞清楚java的基本运算符号
        //1.算术运算符
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); //加法
        // +可以连接字符串
        //如果其中一个操作数是字符串，另一个操作数是数字，java会自动将数字转换为字符串
        //例如：System.out.println("a + b = " + a + b); //结果是103
        System.out.println("a - b = " + (a - b)); //减法
        System.out.println("a * b = " + (a * b)); //乘法
        System.out.println("a / b = " + (1.0 * a / b)); //除法,乘以1.0可以强制转换为double类型
        //注意：java中整数相除，结果是整数，除不尽的部分会被舍去
        //如果想要得到小数结果，可以将其中一个数转换为double类型
        //例如：1.0 * a / b 或者 (double)a / b  
        //或者直接使用浮点数
        System.out.println("a % b = " + (a % b)); //取余
        System.out.println(a + 'a'); //字符和数字相加，结果是数字和字符的ASCII码相加
        System.out.println("swift" + a); //字符串和数字相加，结果是字符串和数字拼接在一起
        // 自增和自减
        //++a 先加后用
        //a++ 先用后加
        //--a 先减后用
        //a-- 先用后减
        //注意：自增和自减运算符只能作用于变量，不能作用于常量
        //例如：++10是错误的，不能对常量进行自增和自减
        int c = a++;
        System.out.println("c = " + c); //c = 10
        System.out.println("a = " + a); //a = 11
        int d = ++a;
        System.out.println("d = " + d); //d = 12
        System.out.println("a = " + a); //a = 12
    }
}
