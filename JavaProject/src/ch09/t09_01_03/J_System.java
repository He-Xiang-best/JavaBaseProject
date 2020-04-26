package ch09.t09_01_03;

// ////////////////////////////////////////////////////////
// 
// J_System.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ϵͳ������Ϣ��ʾ���̡�
// ////////////////////////////////////////////////////////


public class J_System
{
    public static void main(String args[ ])
    {
        String s[ ] = {"file.separator", "java.class.path",
            "java.class.version", "java.compiler", "java.ext.dirs",
            "java.home", "java.io.tmpdir", "java.library.path",
            "java.specification.name", "java.specification.vendor",
            "java.specification.version", "java.vendor",
            "java.vendor.url", "java.version", "java.vm.name",
            "java.vm.specification.name",
            "java.vm.specification.vendor",
            "java.vm.specification.version",
            "java.vm.vendor", "java.vm.version", "line.separator",
            "os.arch", "os.name", "os.version", "path.separator",
            "user.dir", "user.home", "user.name"};
        String r;
        for (int i=0; i<s.length; i++)
        {
            try
            {
                r = System.getProperty(s[i]);
            }
            catch (Exception e)
            {
                r = "�����쳣" + e;
            } // try-catch�ṹ����
            System.out.println(s[i] + ": " + r);
        } // forѭ������
    } // ����main����
} // ��J_System����
