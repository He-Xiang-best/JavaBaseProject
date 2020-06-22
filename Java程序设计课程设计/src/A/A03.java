package A;

import java.util.Scanner;

/**
 * 请写出一个程序能够将给定的整数转换为若干行星号（“*”）。
 * 具体的转换规则如下：例如整数以十进制表示，如果给定正数第i位是n，则倒数第i行输出n个星号
 * @author 何翔
 */
public class A03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串数字");
        print(input.next());
    }
    public  static void  print(String num){
        /**
         * @description:打印信息
         * @params:[num]
         * @return: void
         * @author: 何翔
         * @time: 2020/6/14 15:55
         */
        System.out.println(num+" is converted into：");
        for(int i =0;i<num.length();i++){
            for (int j=0;j<Integer.parseInt(String.valueOf(num.charAt(num.length()-(i+1))));j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
