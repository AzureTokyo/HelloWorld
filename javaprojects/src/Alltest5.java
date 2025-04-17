public class Alltest5 {
    public static void main(String[] args) {
        isPrime();
    }
    // 写一个方法，判断101～200（整数）之间有多少个素数，并输出所有素数。
    public static void isPrime() {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n素数的个数是：" + count);
    }
}
