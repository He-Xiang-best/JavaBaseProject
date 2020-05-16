package ch08;

// ////////////////////////////////////////////////////////
// 
// J_LabelFrame.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     在框架中添加标签的例程。
// ////////////////////////////////////////////////////////

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_LabelFrame extends JFrame
{
    public J_LabelFrame( )
    {
        super( "框架和标签例程" );
     
        String [ ] s = {"文本标签", "文字在图标的左侧", "文字在图标的下方"};
        ImageIcon [ ] ic = {null, new ImageIcon( "img\\img1.gif" ),
            new ImageIcon( "img\\img1.gif" )};
        int  [ ] ih  = {0, JLabel.LEFT,   JLabel.CENTER};
        int  [ ] iv  = {0, JLabel.CENTER, JLabel.BOTTOM};
       
        Container c = this.getContentPane( );
        c.setLayout( new FlowLayout(FlowLayout.LEFT) );
       
        for (int i=0; i<3; i++){
            JLabel aLabel = new JLabel( s[i] , ic[i], JLabel.LEFT);
            if (i>0)
            {
                aLabel.setHorizontalTextPosition(ih[i]);
                aLabel.setVerticalTextPosition(iv[i]);
            } // if结构结束
            aLabel.setToolTipText( "第" + (i+1) + "个标签");
            c.add( aLabel );
        } // for循环结束
    } // J_LabelFrame构造方法结束

    public static void main(String args[ ])
    {
        J_LabelFrame app = new J_LabelFrame( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 360, 150 );
        app.setVisible( true );
    } // 方法main结束
} // 类J_LabelFrame结束
