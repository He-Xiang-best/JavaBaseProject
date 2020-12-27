/*
 * Created by JFormDesigner on Sat Nov 07 13:17:33 CST 2020
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.Vector;

/*
 * @author:何翔
 * @date:2020/11/20 17:44
 * @description:图形界面化版的进制转换器
 /*
    输入一个区间，则可以求出区间内的数值在不同进制条件下所转换的到的值
 */

public class Conversion extends JFrame {
    public static void main(String[] args) {
            new Conversion().showConversionWindow();
    }
    public void showConversionWindow(){
        this.setVisible(true);
    }
    public Conversion() {
        initComponents();
    }
    private void transformAct(ActionEvent e) {
        String start = getStartTextField.getText().toString();
        String end = getEndTextField.getText().toString();
        int a = Integer.parseInt(start);
        int b = Integer.parseInt(end);
        int[] array = new int[b-a+1];
        int x = a;
        for (int i = 0; i < array.length; i++,x++) {
            array[i]=x;
        }
      setTable(array);
    }

    private void setTable(int[] array) {
      DefaultTableModel dft = (DefaultTableModel)listTable.getModel();
      dft.setRowCount(0);
        for (int value:array) {
            Vector v = new Vector();
            v.add(value);
            v.add(Integer.toString(value, 10));
            v.add(Integer.toString(value, 2));
            v.add(Integer.toString(value, 3));
            v.add(Integer.toString(value, 8));
            v.add(Integer.toString(value, 16));
            dft.addRow(v);
        }
    }

    private void resetActionPerformed(ActionEvent e) {
        getStartTextField.setText("");
        getEndTextField.setText("");
    }

    private void exitButtonActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"程序已退出!" );
        this.dispose();
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        listTable = new JTable();
        label1 = new JLabel();
        label2 = new JLabel();
        getStartTextField = new JTextField();
        getEndTextField = new JTextField();
        StartTransButton = new JButton();
        resetButton = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("\u8fdb\u5236\u8f6c\u6362\u5668");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 463, Short.MAX_VALUE)
            );
        }

        //======== scrollPane1 ========
        {

            //---- listTable ----
            listTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null},
                },
                new String[] {
                    "\u6570\u503c", "\u5341\u8fdb\u5236", "\u4e8c\u8fdb\u5236", "\u4e09\u8fdb\u5236", "\u516b\u8fdb\u5236", "\u5341\u516d\u8fdb\u5236"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            scrollPane1.setViewportView(listTable);
        }

        //---- label1 ----
        label1.setText("\u8f93\u5165\u8d77\u59cb\u6570\u503c\uff1a");

        //---- label2 ----
        label2.setText("\u8f93\u5165\u7ec8\u6b62\u6570\u503c\uff1a");

        //---- StartTransButton ----
        StartTransButton.setText("\u5f00\u59cb\u8f6c\u6362");
        StartTransButton.addActionListener(e -> transformAct(e));

        //---- resetButton ----
        resetButton.setText("\u91cd\u7f6e\u6570\u636e");
        resetButton.addActionListener(e -> resetActionPerformed(e));

        //---- button3 ----
        button3.setText("\u9000\u51fa");
        button3.addActionListener(e -> exitButtonActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(getStartTextField, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(getEndTextField, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(StartTransButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                    .addGap(108, 108, 108)
                                    .addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                    .addGap(121, 121, 121)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getStartTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getEndTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(StartTransButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(18, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable listTable;
    private JLabel label1;
    private JLabel label2;
    private JTextField getStartTextField;
    private JTextField getEndTextField;
    private JButton StartTransButton;
    private JButton resetButton;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
