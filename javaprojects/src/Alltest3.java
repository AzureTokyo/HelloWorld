import java.util.Scanner;

public class Alltest3 {
    public static void main(String[] args){
        //调用猜数字的方法
        guessNumber();
    }
    //写一个方法，随机生成一个1～100的整数，提供用户猜测，猜大就提示过大，小就提示过小，知道猜中
    public static void guessNumber() {
        int number = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        while (guess != number) {
            System.out.print("请输入你猜的数字（1-100）：");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("猜大了，请再试一次。");
            } else if (guess < number) {
                System.out.println("猜小了，请再试一次。");
            } else {
                System.out.println("恭喜你，猜对了！");
            }
        }
    }
}
