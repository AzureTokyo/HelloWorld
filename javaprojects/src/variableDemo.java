public class variableDemo {
    public static void main(String[] args){
        printLiteral();

    }
    public static void printLiteral() {
        // 请帮我直接输出常见的字面量
        // 1、整型字面量，直接写
        System.out.println(1);
        // 2、浮点型字面量，直接写（小数）
        System.out.println(1.0);
        // 3、布尔型字面量，只有true false
        System.out.println(true);
        System.out.println(false);
        // 4、字符型字面量，用单引号括起来，里面有且仅有一个字符
        System.out.println('a');
        System.out.println('磊');
        // System.out.println('徐磊'); // 报错
        System.out.println(' ');
        // System.out.println(''); // 报错
        // 掌握一些特殊的字符： \n（换行） \t （tap缩进）
        System.out.println("hello\nworld");
        //字符串变量
        // 5、字符串字面量，用双引号括起来，可以是任意字符
        System.out.println("hello");
        System.out.println("hello world");
        System.out.println("hello\nworld");
        
    }
}
