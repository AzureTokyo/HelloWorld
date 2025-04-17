
import java.util.Scanner;
public class Alltest2 {
    public static void main(String[] args) {
        // 简易版计算器开发
        // 1. 设计一个计算器类，包含加、减、乘、除四个方法
        // 2. 在主方法中创建计算器对象，调用各个方法进行测试
        // 3. 使用Scanner类获取用户输入的数字和运算符
        // 4. 进行相应的计算，并输出结果
        // 5. 处理除数为0的情况
        // 6. 处理输入不合法的情况
        // 7. 设计一个异常类，处理输入不合法的情况
        // 8. 在异常类中定义一个方法，输出错误信息
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("请输入第一个数字:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数字:");
        double num2 = scanner.nextDouble();
        System.out.println("请输入运算符 (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        double result;
        try {
            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    throw new InvalidInputException("不支持的运算符");
            }
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("错误: " + e.getMessage());
        } catch (InvalidInputException e) {
            e.printErrorMessage();
        } finally {
            scanner.close();
        }
    }
    public static class Calculator {
        public double add(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("除数不能为0");
            }
            return a / b;
        }
    }
    public static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }

        public void printErrorMessage() {
            System.out.println("输入不合法: " + getMessage());
        }
    }
    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("输入不能为空");
        }
        // 其他输入验证逻辑
    }
}
