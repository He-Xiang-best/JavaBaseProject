package A;

import java.util.Scanner;

/**
 * 采用泛型编写程序：
 * 1）	定义一个接口形状Shape，该接口有一个方法计算周长、一个方法计算面积；
 * 2）	编写两个实现该接口的具体形状类（自拟），可以是圆形类、矩形类、正方形类皆可。
 * 3）	定义泛型类，成员变量可以是Shape接口生成的任何具体类，
 * 4）	在主方法中利用该泛型类在控制台窗口分别输出给定值的具体形状类的面积和周长。
 */
 interface Shape {
    double calculationC(double c);
    double calculationA(double a);
}
public class A11 <E extends Shape> {
    // 正方形边长和圆的半径，简单就直接用一个量
    static double x = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入正方形的边长：");
        x = input.nextDouble();
        //泛型类，这个类中的方法可以给不同的类共同使用。
        new A11<Z>().outcome(new Z());
        System.out.println("\n请输入圆的半径：");
        x = input.nextDouble();
        new A11<Y>().outcome(new Y());
        input.close();
    }

    public void outcome(E e) {
        System.out.println("计算可得周长为" + e.calculationC(x));
        System.out.println("计算可得面积为" + e.calculationA(x));

    }

}

/**
 * 建立一个正方形类实现Shape接口计算周长和面积
 */
class Z implements Shape {
    @Override
    public double calculationC(double c) {
        return 4*c;
    }

    @Override
    public double calculationA(double a) {
       return a * a;
    }
}

/**
 * 建立一个圆形类实现Shape接口计算周长和面积
 */
class Y implements Shape {
    final double pi = 3.14;

    @Override
    public double calculationC(double c) {
        return (2*pi*c);
    }

    @Override
    public double calculationA(double a) {
        return (a * a * pi);
    }
}
