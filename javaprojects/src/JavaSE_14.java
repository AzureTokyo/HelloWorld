public class JavaSE_14 {
    public static void main(String[] args) {
        printHelloWorld();
    }
    // 使用do while循环打印3行helloworld
    public static void printHelloWorld() {
        int i = 0;
        do {
            System.out.println("Hello, World!");
            i++;
        } while (i < 3);
    }
}
