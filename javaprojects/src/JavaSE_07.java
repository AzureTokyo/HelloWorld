public class JavaSE_07 {
    // 赋值运算符
    // 赋值运算符的优先级低于算术运算符
    // 赋值运算符的右侧表达式会先计算，然后将结果赋值给左侧变量
    // 赋值运算符的右侧表达式可以是一个复杂的表达式
    // 赋值运算符的左侧必须是一个变量，不能是一个常量
    // 赋值运算符的右侧可以是一个常量
    // 种类
    // 1. = 赋值运算符
    // 2. += 加法赋值运算符
    // 3. -= 减法赋值运算符
    // 4. *= 乘法赋值运算符
    // 5. /= 除法赋值运算符
    // 6. %= 取模赋值运算符
    //演示
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a + b = " + c);
        a += b; // a = (a的类型）(a + b)
        System.out.println("a += b = " + a);
        a -= b; // a = a - b
        System.out.println("a -= b = " + a);
        a *= b; // a = a * b
        System.out.println("a *= b = " + a);
        a /= b; // a = a / b
        System.out.println("a /= b = " + a);
        a %= b; // a = a % b
        System.out.println("a %= b = " + a);
    // 关系运算符
    // 关系运算符的优先级低于算术运算符
    // 关系运算符的优先级高于赋值运算符
    //演示
        int x = 10;
        int y = 20;
        boolean result1 = x > y; // false
        boolean result2 = x < y; // true
        boolean result3 = x >= y; // false
        boolean result4 = x <= y; // true
        boolean result5 = x == y; // false
        boolean result6 = x != y; // true
        System.out.println("x > y: " + result1);
        System.out.println("x < y: " + result2);
        System.out.println("x >= y: " + result3);
        System.out.println("x <= y: " + result4);
        System.out.println("x == y: " + result5);
        System.out.println("x != y: " + result6);
        // 三元运算符
        //例子
        int a1 = 10;
        int b1 = 20;
        int max = (a1 > b1) ? a1 : b1; // 如果a1大于b1，则max等于a1，否则max等于b1
        //给出一个成绩，判断通过还是挂科
        int score = 60;
        String result = (score >= 60) ? "通过" : "挂科"; // 如果成绩大于等于60，则通过，否则挂科
        System.out.println("成绩: " + score + ", 结果: " + result);
        max = max(a1, b1, c); // 调用max方法
        System.out.println("最大值: " + max);
    }
    // 写一个好的方法比较3个int的大小,用三元运算符
    public static int max(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    
}
