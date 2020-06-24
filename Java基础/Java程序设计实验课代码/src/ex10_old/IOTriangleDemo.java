package ex10_old;

//import java.io.DataInputStream;
import java.io.DataOutputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTriangleDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("src/ex10/Triangle.txt");
		DataOutputStream dfout = new DataOutputStream(fout);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				dfout.writeBytes(" ");
			for (int k = 0; k < 5 - i; k++) {
				dfout.writeBytes("* ");
			}
			dfout.writeBytes("\n");
		}
		dfout.close();
//		FileInputStream fin = new FileInputStream("src/ex10_old/Triangle.txt");
//		DataInputStream dfin = new DataInputStream(fin);
//		System.out.println("内容:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" ");

			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("已成功写入到文件src/ex10/Triangle.txt中\n请检查!!!");
//		dfin.close();

	}

}
