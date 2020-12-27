package fileEncoder;
/*
 * @author:何翔
 * @date:2020/9/17 22:22
 * @description:
 /*
 Step：
1.由用户选定好指定文件夹下的某个文件
2.点击界面上的“加密”按钮或菜单，程序对文件中的每个字节进行加密。
  加密的规则是：将文件的第i个字节的数值原数值与整数i的按位异或结果
  即若文件的第i个字节为a，则加密结果为b=a∧ i。加密之后的文件另保存为“-JiaMi.txt”进行保存
3.点击“解密”或菜单，对已经加过密的文件进行解密之后，在控制台显示原来的文件内容，并保存。
 */

public class MainEntrance {
    public static void main(String[] args) {
        new DisplayWindow();
    }

}
