package class01;

/*
位运算
 */
public class Code06_PrintB {
    public static void print(int num){
        for(int i = 31; i >= 0; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1"); // num是个32位的二进制数字，
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 24;
        print(num);

        //取反符号  ~
        int a = 21241;
        int b = ~a;
        print(a);
        print(b);
        print(Integer.MAX_VALUE);
        print(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);


    }
    /*
     负数的32位   等于   取反+1
     ^ 异或  ~取反  |或  &与
     >> 右移    >>> 不带符号右移
     */
}
