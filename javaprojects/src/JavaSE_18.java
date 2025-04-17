public class JavaSE_18 {
    public static void main(String[] args){
        randomName();
        System.out.println(names2);
        // 这个数组的地址是第一个元素的地址吗？
        // 不是，数组的地址是一个整体的地址。
    }
    //目标：认识数组的好处，数组的定义，访问。
    //目标：我是一个java初学者，请帮我开发一个随机点名，假设有15名学生。
    public static void randomName(){
        String[] names = {"张三", "李四", "王五", "赵六", "钱七", "孙八", "周九", "吴十", "郑十一", "冯十二",
                "陈十三", "褚十四", "卫十五", "蒋十六", "沈十七"};
        int randomIndex = (int) (Math.random() * names.length);
        System.out.println("随机点名：" + names[randomIndex]);
    }
    // 如果我用new创建一个呢？
    static String[] names2 = new String[]{"张三", "李四", "王五", "赵六", "钱七", "孙八", "周九", "吴十", "郑十一", "冯十二", "陈十三", "褚十四", "卫十五", "蒋十六", "沈十七"};
    // 怎么找到数组的地址
    
}
