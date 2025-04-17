public class Course_16 {
    public static void main(String[] args) {
        // elementary data types
        // integer types
        // byte, short, int, long
        // generally, int is the most used integer type.

        // floating point types
        // float, double
        // generally, double is the most used floating point type.
        
        // character type
        // char

        // boolean type
        // boolean

        // reference types

        // please design a method to report all the data types in Java, just examples.
        reportDataTypes();
        // keywords, don't use them as variable names
        // 驼峰命名法 如何命名 example: myVariableName  这首先用小写字母开头，后面每个单词的首字母大写
        // 大驼峰命名法 例如: MyVariableName  这每个单词的首字母都大写


    }
    public static void reportDataTypes() {
        // integer types
        byte byteValue = 1;
        short shortValue = 2;
        int intValue = 3;
        long longValue = 4L;

        // floating point types
        float floatValue = 5.0f;
        double doubleValue = 6.0;

        // character type reference.
        char charValue = 'A';

        // boolean type
        boolean booleanValue = true;

        // reference types
        String stringValue = "Hello, World!";
        
        System.out.println("Data Types in Java:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}
