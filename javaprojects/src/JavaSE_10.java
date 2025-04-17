public class JavaSE_10 {
    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        // using Scanner to get the user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // using nextInt() to get the user input
        int age = scanner.nextInt();
        
        judgeInternet(age);
    }
    // using if statement to judge if the user can use internet or not(by age)
    public static void judgeInternet(int age) {
        if (age >= 18) {
            System.out.println("You can use the internet.");
        } else {
            System.out.println("You cannot use the internet.");
        }
    }
}
