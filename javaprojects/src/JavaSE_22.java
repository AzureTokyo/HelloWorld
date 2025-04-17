public class JavaSE_22 {
    public static void main(String[] args) {
        start(5);
    }
    //设计数字华容道的初始化
    public static void start(int n){
        int[][] arr = new int[n][n];
        //遍历二维数组给其附值
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count++;
            }
        }
        printArray(arr);   
        
        // 打乱顺序
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int randomRow = (int) (Math.random() * n);
                int randomCol = (int) (Math.random() * n);
                //交换位置
                int temp = arr[i][j];
                arr[i][j] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = temp;
            }
        }
        System.out.println("打乱后的数组：");
        printArray(arr);
    }

    //打印二维数组
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
