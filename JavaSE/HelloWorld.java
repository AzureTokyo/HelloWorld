package HelloWorld;
public class HelloWorld{
public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("______________");
    printHelloWorld();
    System.out.println("______________");
    /* 你不需要在这里输入a和b它就可以 */
    System.out.println(sum(1, 2));
    /*我们在这里调用了第一个公共函数 on April 9th 2025*/
    /*我们用public 表示这个函数可以被公共调用，然后static（我们需要确认这个的意思）
     * 然而void表示不会返回一个value，然后我们（）表示我们不需要任何参数
     */
}
public static void printHelloWorld(){
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
}
/*定义一个sum函数 */
public static int sum(int a, int b){
    return a + b;
}
//注解写法1 单行
/*
  注解写法2 多行
 */


}
/*你的第一个Hello World on April 9th 2025 */
