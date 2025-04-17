public class JavaSE_08 {
    public static void main(String[] args) {
        // 逻辑运算符举例
        // 逻辑与
        boolean a = true;
        boolean b = false;
        boolean c = a && b; // false
        // 逻辑或
        boolean d = a || b; // true
        // 逻辑非
        boolean e = !a; // false
        // 逻辑异或     
        boolean f = a ^ b; // true
    }
    // define a method to hunts for spouses for users using the logic operator
    public static void findSpouse(String user) {
        // 逻辑运算符举例
        // 逻辑与
        boolean isSingle = true;
        boolean isAvailable = true;
        boolean isCompatible = isSingle && isAvailable; // true
        // 逻辑或
        boolean isInterested = false;
        boolean isAttracted = isSingle || isInterested; // true
        // 逻辑非
        boolean isNotInterested = !isInterested; // true
        // 逻辑异或     
        boolean isDifferent = isSingle ^ isInterested;
    } // true
    // define a similar method to find a job using only or operator,a simple one
    public static void findJob(String user) {
        // 逻辑运算符举例
        // 逻辑或
        boolean isAvailable = true;
        boolean isQualified = false;
        boolean isInterested = isAvailable || isQualified; // true
        // 逻辑非
        boolean isNotInterested = !isQualified; // true
        // 逻辑异或     
        boolean isDifferent = isAvailable ^ isQualified; // true

    }
    //单与 和 双与
    //区分
    //单与：&  双与：&&
    //区别：&和&&的区别在于：&是位运算符，&&是逻辑运算符
    //前面的表达式为true时，&和&&的结果相同
    //前面的表达式为false时，&和&&的结果不同
    //单或 和 双或
    //区分
    //单或：|  双或：||
    //区别：|和||的区别在于：|是位运算符，||是逻辑运算符
    //前面的表达式为true时，|和||的结果相同
    //前面的表达式为false时，|和||的结果不同
    // 双或只有在前面的表达式为false时，才会执行后面的表达式，比如后面是++1.
    //单非 和 双非
    




}
