public class JavaSE_11 {
    public static void main(String[] args) {
        //目标：搞清楚switch分支结构的应用以及写法，
        //我需要自己输入，调用这个方法
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入性别（男/女）：");
        String gender = scanner.next();
        recommendBooks(gender);
        scanner.close();
        // case和if的区别
        // 1. case是switch语句的组成部分，if是单独的语句
        // 2. case只能用于switch语句中，if可以单独使用
        // 3. case只能用于整数、字符、字符串等类型，if可以用于任意类型，不支持double,float,long
        // 4. case只能用于等值判断，if可以用于任意条件判断
        // 5. case可以有多个分支，if只能有一个分支
        // 6. case可以有默认分支，if没有默认分支
        // 7. case可以有多个case分支，if只能有一个if分支
        // 8. case可以有break语句，if没有break语句
        // 9. case可以有return语句，if没有return语句
        // 10. case可以有continue语句，if没有continue语句
    }
    // 需求：根据男女性别的不同，推荐不同的书本信息给其观看
    // 1.定义一个方法，接收一个参数，表示性别
    // 2.根据性别的不同，推荐不同的书本信息
    // 3.如果性别不在男和女的范围内，给出提示信息
    public static void recommendBooks(String gender) {
        switch (gender) {
            case "男":
                System.out.println("推荐书籍：<JAVA编程思想> 等适合男士的书籍");
                break;
            case "女":
                System.out.println("推荐书籍：<简爱> 等适合女士的书籍");
                break;
            default:
                System.out.println("性别输入有误，请输入男或女。");
                break;
        }
    }
}
