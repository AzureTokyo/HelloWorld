public class JavaSE_21 {

    // 用二维数组，储存第一排，第二排，第n排同学的信息
    public static void main(String[] args) {
        String[][] students = new String[3][5]; // 3 rows, 5 columns
        students[0][0] = "Alice";
        students[0][1] = "Bob";
        students[1][0] = "Charlie";
        students[1][1] = "David";
        students[2][0] = "Eve";
        students[2][1] = "Frank";

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();

        }
        //动态二维数组
        int[][] dynamicArray = new int[3][5];
        for (int i = 0; i < dynamicArray.length; i++) {
            for (int j = 0; j < dynamicArray[i].length; j++) {
                dynamicArray[i][j] = i * j; // Example initialization
            }
        }
        // Print the dynamic array
        for (int i = 0; i < dynamicArray.length; i++) {
            for (int j = 0; j < dynamicArray[i].length; j++) {
                System.out.print(dynamicArray[i][j] + " ");
            }
            System.out.println();
        }

        // 访问
        String[][] students2 = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Eve", "Frank"},
                {"Grace", "Heidi", "Ivan"}
        };
        String[] name2 = students2[2];
        for (int i = 0; i < name2.length; i++) {
            System.out.print(name2[i] + " ");
        }
        System.out.println();
        // 访问长度
        System.out.println(students2.length); // 访问行数
        System.out.println(students2[0].length); // 访问第一行的长度
        // 遍历二维数组
        for (int i = 0; i < students2.length; i++) {
            for (int j = 0; j < students2[i].length; j++) {
                System.out.print(students2[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
