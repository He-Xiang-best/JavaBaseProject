package ch09.t09_03_02;

// ////////////////////////////////////////////////////////
// 
// J_List.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     同时是应用程序与小应用程序的图像显示例程。
// ////////////////////////////////////////////////////////


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class J_List extends JApplet
{
    private String    m_items[ ] = { "snow.gif", "flag.gif" , "rain.gif"};
    private JList     m_list    = new JList( m_items );
    private JLabel    m_label   = new JLabel( );
    private Icon      m_icons[ ] = new ImageIcon[3];
    private Image     m_image[ ] = null;
    Container m_container = null;

    public void init( )
    {
        int i;
        if (m_image == null)
        {
            m_image = new Image[3];
            for (i=0; i< 3; i++)
                m_image[i] = getImage(getCodeBase( ), m_items[i]);
        } // if结构结束
        for (i=0; i< 3; i++)
            m_icons[i] = new ImageIcon(m_image[i]);
        if (m_container == null)
            m_container = getContentPane( );
        m_container.setLayout(new BorderLayout( ));
        m_container.add( m_list, BorderLayout.WEST );
        m_list.setSelectedIndex(0);
        m_list.addListSelectionListener(new ListSelectionListener( )
            {
                public void valueChanged(ListSelectionEvent e )
                {
                    int s = m_list.getAnchorSelectionIndex( );
                    m_label.setIcon( m_icons[ s ] );
                } // 方法valueChanged结束
            } // 实现接口ListSelectionListener的内部类结束
        ); // addListSelectionListener方法调用结束
        m_container.add( m_label, BorderLayout.EAST );
        m_label.setIcon( m_icons[ 0 ] );
    } // 方法init结束

    public static void main( String args[ ] )
    { 
        JFrame f = new JFrame("应用程序");
        J_List app = new J_List( );

        app.m_container= f.getContentPane( );
        app.m_image = new Image[3];
        try
        {
            for (int i=0; i< 3; i++)
                app.m_image[i] = ImageIO.read( new File(app.m_items[i]) );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
        app.init( );
        f.setSize(200, 110);
        f.setVisible( true );
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // 方法main结束
} // 类J_List结束
