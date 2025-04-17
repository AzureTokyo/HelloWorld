public class JavaSE_02 {
    // reload a method.
    // please write a method that lets beginner to know how to reload a method.
    // method overloading
    public void methodOverloading(int a) {
        System.out.println("Method with int parameter: " + a);
    }
    public void methodOverloading(double a) {
        System.out.println("Method with double parameter: " + a);
    }
    public void methodOverloading(String a) {
        System.out.println("Method with String parameter: " + a);
    }
    // obejct: handling the method that can end early when using return.
    // please write a method that lets beginner to know how to end early when using return.
    public void earlyReturnExample(int a) {
        if (a < 0) {
            System.out.println("Negative number, exiting method.");
            return; // early exit 卫语言风格
        }
        System.out.println("Positive number: " + a);
    }

    public static void main(String[] args) {
        JavaSE_02 javaSE_02 = new JavaSE_02();
        javaSE_02.methodOverloading(10);
        javaSE_02.methodOverloading(10.5);
        javaSE_02.methodOverloading("Hello");
        javaSE_02.earlyReturnExample(-5);
    }
}
