package ch09.t09_01_03;

// ////////////////////////////////////////////////////////
// 
// J_System.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     系统属性信息显示例程。
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
                r = "出现异常" + e;
            } // try-catch结构结束
            System.out.println(s[i] + ": " + r);
        } // for循环结束
    } // 方法main结束
} // 类J_System结束
