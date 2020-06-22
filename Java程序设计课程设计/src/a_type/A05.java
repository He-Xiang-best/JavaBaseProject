package a_type;

/**
 *编写程序输出从1到9的乘法口诀表，口诀的前一部分是：
 * 1*1=1
 * 1*2=2；2*2=4；
 * 1*3=3；2*3=6；3*3=9；
 * ……
 */
public class A05 {
    public static void main(String[] args) {
        print(9);
    }

    public static void print(int num){
/**
 * @description:
 * @params:[num]
 * @return: void
 * @author: 何翔
 * @time: 2020/6/14 15:41
 */
        for (int i=1;i<=num;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
