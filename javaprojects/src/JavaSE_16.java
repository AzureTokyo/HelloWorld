public class JavaSE_16 {
    public static void main(String[] args) {
        printStar(4, 5);
        printPlus(9);
    }
    //打印4行5列的星号的方法
    public static void printStar(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPlus(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print((j*i) + "\t");
            }
            System.out.println();
        }
    }
}
