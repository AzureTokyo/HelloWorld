public class JavaSE_20 {
    //写一个主方法
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,7,6,4,8,9,0};
        getMax(arr);
        System.out.println("最大值是：" + getMax(arr));
    }
    public static double getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int data = arr[i];
            if (data > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // 写一个方法，返回数组的最小值
    public static double getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int data = arr[i];
            if (data < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
