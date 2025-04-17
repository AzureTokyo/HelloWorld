import java.util.Scanner;
public class JavaSE_05 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a number: ");
        // Read the input number
        int number = scanner.nextInt();
        // print the number
        System.out.println("You entered: " + number);
        // 如果是输入字符，字符串呢？
        // 1. 读取字符串
        System.out.print("Enter a string: ");
        // 2. 读取字符串
        String str = scanner.next();
        // 3. 打印字符串
        System.out.println("You entered: " + str);
        //如果是double？
        // 1. 读取字符串
        System.out.print("Enter a double: ");
        // 2. 读取字符串
        double d = scanner.nextDouble();
        // 3. 打印字符串
        //如果是float呢？
        // 1. 读取字符串
        System.out.print("Enter a float: ");
        // 2. 读取字符串
        float f = scanner.nextFloat();
        // 3. 打印字符串
        System.out.println("You entered: " + f);
        //如果是boolean呢？
        // 1. 读取字符串
        System.out.print("Enter a boolean: ");
        // 2. 读取字符串
        boolean b = scanner.nextBoolean();
        // 3. 打印字符串
        System.out.println("You entered: " + b);
        //如果是char呢？
        // 1. 读取字符串
        System.out.print("Enter a char: ");
        // 2. 读取字符串
        char c = scanner.next().charAt(0);
        // 3. 打印字符串
        System.out.println("You entered: " + c);
        //如果是long呢？
        // 1. 读取字符串
        System.out.print("Enter a long: ");
        // 2. 读取字符串
        long l = scanner.nextLong();
        // 3. 打印字符串       
        System.out.println("You entered: " + l);
        //如果是byte呢？
        // 1. 读取字符串
        System.out.print("Enter a byte: ");
        // 2. 读取字符串
        byte b1 = scanner.nextByte();
        // 3. 打印字符串
        System.out.println("You entered: " + b1);
        //如果是short呢？
        // 1. 读取字符串
        System.out.print("Enter a short: ");
        // 2. 读取字符串
        short s = scanner.nextShort();
        // 3. 打印字符串
        System.out.println("You entered: " + s);
        

    }
}
