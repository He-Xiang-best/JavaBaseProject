package ch07;

// ////////////////////////////////////////////////////////
// 
// J_BufferedReaderWriter.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     带缓存读写器例程。
// ////////////////////////////////////////////////////////


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class J_BufferedReaderWriter
{
    public static void main(String args[ ])
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("test.txt"));
            bw.write("有志者，事竞成.");
            bw.newLine( );
            bw.write("苦心人，天不负");
            bw.newLine( );
            bw.close( );

            LineNumberReader br = new LineNumberReader(
                new FileReader("test.txt"));
            String s;
            for (s=br.readLine( ); s!=null; s=br.readLine( ))
                System.out.println( br.getLineNumber( ) + ": " + s);
            br.close( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_BufferedReaderWriter结束
