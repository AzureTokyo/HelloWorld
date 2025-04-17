public class JavaSE_01 {
    // define a method first to add a and b togeter.
    public static int add(int a, int b) {
        return a + b;
    }
    // define a main method to test the add method.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("the sum of " + a + " and " + b + " is: " + add(a, b));
        //用占位符表示新的c和d的和
        int c = 20;
        int d = 30;
        System.out.printf("The sum of %d and %d is: %d\n", c, d, add(c, d));
        // first, you need to know that is there a need to return value or not.
        // second, you need to know that is there a need to receive value or not.
        // define a method that do not need to receive value or return value.
        print();
    }
    // define a method that do not need to receive value or return value.
    public static void print() {
        System.out.println("This is a method that do not need to receive value or return value.");
    }
    // 获取一个指定位数的验证码返回
    //需要接受不了数据 int len
    // 需要返回一个字符串
    public static String getCode(int len) {
        // 定义一个字符串变量
        String code = "";
        // 定义一个字符数组
        char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        // 循环len次
        for (int i = 0; i < len; i++) {
            // 随机获取一个字符
            int index = (int) (Math.random() * chars.length);
            // 拼接字符串
            code += chars[index];
        }
        return code;
    }
}

