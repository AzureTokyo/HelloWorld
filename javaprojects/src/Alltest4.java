public class Alltest4 {
    public static void main(String[] args) {
        //创建一个Code对象
        Code code = new Code();
        //调用getCode方法，生成一个6位的验证码
        String verificationCode = code.getCode(6);
        //输出验证码
        System.out.println("验证码是：" + verificationCode);
    }
    //定义一个程序，可以生成指定位数的验证码，每一位可以是数字，或者大小写字母
    public static class Code {
        //定义一个方法，生成验证码
        public String getCode(int length) {
            //定义一个字符串，包含所有可能的字符
            String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            //定义一个StringBuilder，用于存储验证码
            StringBuilder code = new StringBuilder();
            //循环length次，随机选择字符
            for (int i = 0; i < length; i++) {
                //生成一个随机索引
                int index = (int) (Math.random() * str.length());
                //将随机字符添加到验证码中
                code.append(str.charAt(index));
            }
            return code.toString();
        }
    }
}
