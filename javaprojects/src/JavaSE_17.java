public class JavaSE_17 {
    public static void main(String[] args) {
        breakExample();
        continueExample();
    }
    // break的例子
    public static void breakExample() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // 跳出循环
            }
            System.out.println(i);
        }
    }
    // continue的例子
    public static void continueExample() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // 跳过当前循环
            }
            System.out.println(i);
        }
    }
}
