import java.util.Scanner;
/*
 * @author:何翔
 * @date:2020/11/20 17:44
 * @description:控制台版进制转换器
 /*
 
 */

public class ConversionDemo {
    public static void main(String[] args) {
        int[] arrayTmp = getRangeArray();
        printTen(arrayTmp);
        printConversions(arrayTmp, 2);
        printConversions(arrayTmp, 3);
        printConversions(arrayTmp, 8);
        printConversions(arrayTmp, 16);
    }
    public static int[] getRangeArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("选择原数十进制");
        System.out.print("起始数值：");
        int a =input.nextInt();
        System.out.print("终止数值：");
        int b =input.nextInt();
        int[] array = new int[b-a+1];
        int x = a;
        for (int i = 0; i < array.length; i++,x++) {
            array[i]=x;
        }
        System.out.println();
        return array;
    }
    public static void printTen(int[] array){
        System.out.print("10进制\t");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
    public static void printConversions(int[] array,int num){
        System.out.print(num+"进制\t");
        for (int value : array) {
            System.out.print(Integer.toString(value, num) + "\t");
        }
        System.out.println();
    }
}
