package ex6_;
/**
 * 第四章第五题
 * 主方法所在的测试类
 * @author 郭晓燕
 * 2016.4.16
 * @since jdk1.6
 *
 */
public class Four_5 {
	public static void main(String args[]){
		Four_5_MathRandom math=new Four_5_MathRandom(21);
		math.randomAndCount(10000, 20);
		math.printInfo();
		
	}
}
