package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Lines.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     组合框、列表框、文本区域和滚动窗格例程。
// ////////////////////////////////////////////////////////



import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class J_Lines extends JFrame
{
    public J_Lines( )
    {
        super( "多行组件例程" );
        Container c = getContentPane( );
        c.setLayout( new FlowLayout( ) );

        String [] s = {"选项1", "选项2", "选项3"};
        JComboBox cb = new JComboBox( s );
        JList t = new JList( s );
        JTextArea ta = new JTextArea("1\n2\n3\n4\n5", 3, 10);
        JScrollPane sta = new JScrollPane( ta );
        c.add( cb );
        c.add( t );
        c.add( sta );
    } // J_Lines构造方法结束

    public static void main(String args[ ])
    {
        J_Lines app = new J_Lines( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 250, 120 );
        app.setVisible( true );
    } // 方法main结束
} // 类J_Lines结束
