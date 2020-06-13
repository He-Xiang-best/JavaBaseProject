package ex08;
/**
 * 
 * @content:枚举每一个星期的名称
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午8:33:44
 * @第一次修改的时间：
 * @time:2020年5月27日下午8:33:44
 * @修改原因：课堂测验，修改内容：
 */
public class P177_3 {

	public static void main(String[] args) {
		for (week w : week.values()) {
			System.out.print(w+"\t");
		}

	}

}

enum week{
	星期一,星期二,星期三,星期四,星期五,星期六,星期天
}