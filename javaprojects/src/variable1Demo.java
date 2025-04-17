public class variable1Demo {
    public static void main(String[] args) {
        // Declare a variable
        int myNumber;

        // Assign a value to the variable
        myNumber = 10;

        // Print the value of the variable
        System.out.println("The value of myNumber is: " + myNumber);

        // Change the value of the variable
        myNumber = 20;

        // Print the new value of the variable
        System.out.println("The new value of myNumber is: " + myNumber);
        printVariable();
    }
    public static void printVariable(){
        // Declare and initialize a variable 
        // int is a data type
        // variable name is age
        // and 25 is the value assigned to it
        int age = 25;
        System.out.println("The value of age is: " + age);
        // Change the value of the variable
        // 需求,微信钱包目前有9.9发出去5元，又收到了6元。
        double wechat = 9.9;
        wechat = wechat - 5 + 6;
        System.out.println("The value of wechat is: " + wechat);
        
    }
}
