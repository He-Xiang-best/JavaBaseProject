package ex6_;
/**
 * 第四章第六题
 * 主测试类
 * 调用生成随机字母类
 * @author Administrator
 *
 */
public class Four_6 {

	public static void main(String[] args) {
		Four_6_RandomLetter ranLetter=new Four_6_RandomLetter(10);
		ranLetter.Random(10);//随机生成十次字母
		ranLetter.printArray();//打印数组

	}

}
