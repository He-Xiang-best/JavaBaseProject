package ch07;

// ////////////////////////////////////////////////////////
// 
// J_File.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �ļ����̡�
// ////////////////////////////////////////////////////////

import java.io.File;

public class J_File
{
    public static void main(String args[ ])
    {
        for (int i = 0; i < args.length; i++)
        { 
            File f = new File(args[i]); 
            if (f.exists( ))
            { 
                System.out.println("getName: " + f.getName( ));
                System.out.println("getPath: " + f.getPath( ));
                System.out.println("getParent: " + f.getParent( ));
                System.out.println("length: " + f.length( ));
            } 
            else System.out.printf("�ļ�%1$s������%n", args[i]);
        } // forѭ������
    } // ����main����
} // ��J_File����
