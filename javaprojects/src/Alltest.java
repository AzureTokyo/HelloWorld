import java.util.Scanner;


public class Alltest {
    //目标： 完成健康计算器
    // 先让用户输入个人信息：身高、体重、性别、年龄
    // 然后计算BMI值（交给一个方法计算）
    //然后计算BMR值（交给一个方法计算） 
    // 计算BMI值的方法
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
    // 计算BMR值的方法
    public static double calculateBMR(double height, double weight, int age, String sex) {
        // 将身高从米转换为厘米
        double heightInCm = height * 100;
        
        // 根据性别使用不同的公式计算BMR
        if (sex.equals("男")) {
            // 男性BMR计算公式
            return 88.362 + (13.397 * weight) + (4.799 * heightInCm) - (5.677 * age);
        } else {
            // 女性BMR计算公式
            return 447.593 + (9.247 * weight) + (3.098 * heightInCm) - (4.330 * age);
        }
    }    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的身高（单位：米）：");
        double height = scanner.nextDouble();
        System.out.println("请输入您的体重（单位：千克）：");
        double weight = scanner.nextDouble();
        System.out.println("请输入您的性别（男/女）：");
        String sex = scanner.next();
        System.out.println("请输入您的年龄（单位：岁）：");
        int age = scanner.nextInt();
        // 计算BMI值
        double bmi = calculateBMI(height, weight);
        // 计算BMR值
        double bmr = calculateBMR(height, weight, age, sex);
        // 输出结果
        System.out.printf("您的BMI值为：%.2f\n", bmi);
        System.out.printf("您的BMR值为：%.2f\n", bmr);
        // 判断BMI值的范围
        if (bmi < 18.5) {
            System.out.println("您的体重过轻。");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("您的体重正常。");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("您的体重超重。");
        } else {
            System.out.println("您的体重肥胖。");
        }
        // 判断BMR值的范围
        if (bmr < 1200) {
            System.out.println("您的基础代谢率偏低。");
        } else if (bmr >= 1200 && bmr < 1800) {
            System.out.println("您的基础代谢率正常。");
        } else {
            System.out.println("您的基础代谢率偏高。");
        }
        // 关闭扫描器
        scanner.close();

        

    }
    
}
