public class JavaSE_19 {
    //定义一个主方法
    //目标：掌握数组的另一种定义形式，动态初始化数组
    
    public static void main(String[] args) {
        inputScore();
    }
    public static void inputScore(){
        //定义一个数组，存放10个学生的成绩
        double[] score = new double[10];
        //手动输入成绩，用scanner类
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入10个学生的成绩：");
        //循环输入成绩
        for (int i = 0; i < score.length; i++) {
            System.out.print("第" + (i + 1) + "个学生的成绩：");
            score[i] = scanner.nextDouble();
        }
        //关闭scanner
        scanner.close();
        //输出数组的值
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        } 
        System.out.println();
    }
    //如果我想创建一个无限长度的数组呢？
    //可以使用集合类，ArrayList
    //ArrayList是一个动态数组，可以随意添加元素
    //ArrayList是一个类，属于java.util包
    public static void inputScoreWithArrayList() {
        java.util.ArrayList<Double> scores = new java.util.ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入学生的成绩，输入负数结束：");
        while (true) {
            System.out.print("请输入成绩：");
            double score = scanner.nextDouble();
            if (score < 0) {
                break;
            }
            scores.add(score);
        }
        scanner.close();
        System.out.println("输入的成绩为：");
        for (double s : scores) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
