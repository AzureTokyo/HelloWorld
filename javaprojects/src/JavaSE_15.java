public class JavaSE_15 {
    public static void main(String[] args) {
        deadLoop();
    }
    //写一个方法，掌握死循环
    public static void deadLoop() {
        while (true) {
            System.out.println("死循环");
        }
    }
    //用for实现呢？
    public static void deadLoop2() {
        for (int i = 0; ; i++) {
            System.out.println("死循环");
        }
    }
    // do whlie 实现
    public static void deadLoop3() {
        do {
            System.out.println("死循环");
        } while (true);
    }
}
