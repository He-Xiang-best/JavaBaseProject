package ex10_old;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTriangleDemo2 {

	public static void main(String[] args) throws IOException {
		//注意：此文件默认不存在
		final String FilePath1 = "src/ex10/Triangle2.txt";
		OutputStream outStream = new FileOutputStream(FilePath1, false);//第二个参数：是否追加写入
		String content = " * * * * *\n";
		content+= "  * * * *\n";
		content+="   * * *\n";
		content+="    * *\n";
		content+="     *\n";
		outStream.write(content.getBytes());//核心语句：将字符串转换成字节数组，写入到文件中
		outStream.close();
		System.out.println("内容:");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" ");

			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("已成功写入到文件" + FilePath1 + "中\n请检查!!!");

	}

}
