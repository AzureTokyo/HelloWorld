public class Course_1415 {
    public static void main(String[] args) {
       // 二进制 缝二进一 x = 2^n + 2^(n-1) + ... + 2^0
       // x/2 = 2^(n-1) + 2^(n-2) + ... + 2^0 这样算下去。
       // 计算机最小存储单位是字节，1字节 = 8bit 
       // 所以十进制的6，也就是二进制的110，存储在计算机中是00000110
       // 字符储存在计算机中是用ASCII码来存储的
       // 0的ASCII码是48，A的ASCII码是65
       // 十进制 y = 10^n + 10^(n-1) + ... + 10^0
       int k1  = 0b110; // 二进制
       System.out.println(k1); // 6
       int k2 = 076; // 八进制
       System.out.println(k2); // 62
       int k3 = 0x3E; // 十六进制
       System.out.println(k3); // 62
    }
}