/*
 * Created by JFormDesigner on Thu Nov 19 21:52:32 CST 2020
 */

package view.scoreView;

import classType.infoType.ClassScore;
import sqlContact.ScoreContact;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Vector;

/*
 * @author:何翔
 * @date:2020/11/20 9:58
 * @description:成绩统计窗口
 /*
 
 */

public class ScoreStatistics extends JFrame {
    public void showScoreStatisticsWindow(){
        this.setVisible(true);
    }
    public ScoreStatistics() {
        initComponents();
        setTable();
    }
private void setTable(){
        /*
         * @author: 何翔
         * @param: []
         * @return: void
         * @date: 2020/11/20 9:59
         * @description：获取统计信息
         */
    DefaultTableModel dft = (DefaultTableModel) ClassScoreListTable.getModel();
    dft.setRowCount(0);
    ScoreContact scoreContact = new ScoreContact();
    List<ClassScore> classList = scoreContact.getScoreList3();
    for (ClassScore sc : classList) {
        Vector v = new Vector();
        v.add(sc.getClassId());
        v.add(sc.getAllNum());
        v.add(sc.getGoodNum());
        v.add((float)sc.getGoodNum()/sc.getAllNum());
        v.add(sc.getBadNum());
        v.add((float)sc.getBadNum()/sc.getAllNum());
        dft.addRow(v);
    }
    scoreContact.CloseCon();
}
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        ClassScoreListTable = new JTable();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            //======== scrollPane1 ========
            {

                //---- ClassScoreListTable ----
                ClassScoreListTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "\u73ed\u7ea7\u7f16\u53f7", "\u603b\u4eba\u6570", "\u4f18\u79c0\u4eba\u6570", "\u4f18\u79c0\u7387", "\u4e0d\u53ca\u683c\u4eba\u6570", "\u4e0d\u53ca\u683c\u7387"
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
                scrollPane1.setViewportView(ClassScoreListTable);
            }

            //---- label1 ----
            label1.setText("\u73ed\u7ea7\u6210\u7ee9\u7edf\u8ba1\u60c5\u51b5");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(279, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable ClassScoreListTable;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
