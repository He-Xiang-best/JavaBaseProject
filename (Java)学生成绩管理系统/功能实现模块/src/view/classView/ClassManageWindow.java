/*
 * Created by JFormDesigner on Tue Nov 03 20:24:47 CST 2020
 */

package view.classView;

import classType.infoType.ClassInfo;
import sqlContact.ClassContact;
import util.StringUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

/*
 * @author:何翔
 * @date:2020/11/20 9:43
 * @description:班级管理窗口
 /*
 
 */

public class ClassManageWindow {
    public ClassManageWindow() {
        initComponents();
        setTable(new ClassInfo());
    }
    public void showClassControlWindow(){
        classControlFrm.setVisible(true);
    }
    private void setTable(ClassInfo studentClass){
        DefaultTableModel dft = (DefaultTableModel) classListTable.getModel();
        dft.setRowCount(0);
        ClassContact classContact = new ClassContact();
        List<ClassInfo> classList = classContact.getClassList(studentClass);
        for (ClassInfo sc : classList) {
            Vector v = new Vector();
            v.add(sc.getId());
            v.add(sc.getName());
            v.add(sc.getInfo());
            dft.addRow(v);
        }
        classContact.CloseCon();
    }

    private void searchButton1ActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:41
         * @description：按给定的条件查询班级信息
         */
        ClassInfo classInfo = new ClassInfo();
        String str = (String) classComboBox1.getSelectedItem();
        if("班级名称:".equals(str))
        classInfo.setName(searchClassNametextField1.getText().toString());
        else if("全部".equals(str)){
            setTable(classInfo);
        }
        else{
            String str2 =searchClassNametextField1.getText().toString();
            if(StringUtil.isEmpty(str2)){
                setTable(classInfo);
                return;}
            classInfo.setId(Integer.parseInt(searchClassNametextField1.getText().toString()));
        }
        setTable(classInfo);
    }

    private void classListTable1MouseClicked(MouseEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:42
         * @description：通过点击事件是文本栏显示列表信息
         */
        DefaultTableModel dft = (DefaultTableModel) classListTable.getModel();
        classIDTextField.setText(dft.getValueAt(classListTable.getSelectedRow(), 0).toString());
        classNameTextField.setText(dft.getValueAt(classListTable.getSelectedRow(), 1).toString());
        classNumberTextField.setText(dft.getValueAt(classListTable.getSelectedRow(), 2).toString());
    }

    private void deleteClassAct(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:42
         * @description：删除班级信息
         */
        if(JOptionPane.showConfirmDialog(classControlFrm, "您确定删除么？") != JOptionPane.OK_OPTION){
            return;
        }
        int index = classListTable.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(classControlFrm, "请选中要删除的数据!");
            return;
        }
        DefaultTableModel dft = (DefaultTableModel) classListTable.getModel();
        //int id = Integer.parseInt(dft.getValueAt(classListTable.getSelectedRow(), 0).toString());
        int id = Integer.parseInt(classIDTextField.getText().toString());
        ClassContact classContact = new ClassContact();
        if(classContact.delete(id)){
            JOptionPane.showMessageDialog(classControlFrm, "删除成功!");
        }else{
            JOptionPane.showMessageDialog(classControlFrm, "删除失败!");
        }
        classContact.CloseCon();
        setTable(new ClassInfo());
    }

    private void confirmEditButtonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:43
         * @description：修改班级信息
         */
        ClassContact classContact = new ClassContact();
        int index = classListTable.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(classControlFrm, "请选中要修改的数据!");
            return;
        }
        DefaultTableModel dft = (DefaultTableModel) classListTable.getModel();
        String classID = dft.getValueAt(classListTable.getSelectedRow(), 0).toString();
        String className = dft.getValueAt(classListTable.getSelectedRow(), 1).toString();
        String classInfo = dft.getValueAt(classListTable.getSelectedRow(), 2).toString();
        String editClassID = classIDTextField.getText().toString();
        String editClassName = classNameTextField.getText().toString();
        String editClassInfo = classNumberTextField.getText().toString();
        if(StringUtil.isEmpty(editClassName)||StringUtil.isEmpty(editClassInfo)||StringUtil.isEmpty(editClassID)){
            JOptionPane.showMessageDialog(classControlFrm, "请填写要修改的内容!");
            return;
        }
        if(className.equals(editClassName) && classInfo.equals(editClassInfo)&& classID.equals(editClassID)){
            JOptionPane.showMessageDialog(classControlFrm, "您还没有做任何修改!");
            return;
        }
        int id = Integer.parseInt(classID);
        int editID = Integer.parseInt(editClassID);

        ClassInfo sc = new ClassInfo();
        sc.setId(id);
        sc.setName(editClassName);
        sc.setInfo(editClassInfo);
        if(classContact.update(sc,editID)){
            JOptionPane.showMessageDialog(classControlFrm, "更新成功!");
        }else{
            JOptionPane.showMessageDialog(classControlFrm, "更新失败!");
        }
        classContact.CloseCon();
        setTable(new ClassInfo());
    }

    private void resetButtonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:48
         * @description：重置文本栏信息
         */
        classNumberTextField.setText("");
        classNameTextField.setText("");
        classIDTextField.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        classControlFrm = new JFrame();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        classListTable = new JTable();
        searchClassNametextField1 = new JTextField();
        button1 = new JButton();
        classComboBox1 = new JComboBox<>();
        label1 = new JLabel();
        label2 = new JLabel();
        classNameTextField = new JTextField();
        classIDTextField = new JTextField();
        label3 = new JLabel();
        classNumberTextField = new JTextField();
        confirmEditButton = new JButton();
        DeletInfoButton = new JButton();
        resetButton = new JButton();

        //======== classControlFrm ========
        {
            classControlFrm.setTitle("\u73ed\u7ea7\u4fe1\u606f\u7ba1\u7406");
            var classControlFrmContentPane = classControlFrm.getContentPane();

            //======== panel1 ========
            {

                //======== scrollPane1 ========
                {

                    //---- classListTable ----
                    classListTable.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, ""},
                        },
                        new String[] {
                            "\u73ed\u7ea7\u7f16\u53f7", "\u73ed\u7ea7\u540d\u79f0", "\u6240\u5c5e\u5b66\u9662"
                        }
                    ) {
                        boolean[] columnEditable = new boolean[] {
                            false, false, false
                        };
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = classListTable.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(2).setResizable(false);
                    }
                    classListTable.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            classListTable1MouseClicked(e);
                        }
                    });
                    scrollPane1.setViewportView(classListTable);
                }

                //---- button1 ----
                button1.setText("\u67e5\u8be2");
                button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
                button1.setIcon(new ImageIcon(getClass().getResource("/image/ClassView/\u67e5\u8be2.png")));
                button1.addActionListener(e -> searchButton1ActionPerformed(e));

                //---- classComboBox1 ----
                classComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "\u5168\u90e8",
                    "\u73ed\u7ea7\u540d\u79f0:",
                    "\u73ed\u7ea7\u7f16\u53f7:"
                }));
                classComboBox1.setFont(classComboBox1.getFont().deriveFont(classComboBox1.getFont().getSize() + 10f));

                //---- label1 ----
                label1.setText("\u73ed\u7ea7\u540d\u79f0:");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));

                //---- label2 ----
                label2.setText("\u73ed\u7ea7\u7f16\u53f7:");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

                //---- classIDTextField ----
                classIDTextField.setEditable(false);

                //---- label3 ----
                label3.setText("\u6240\u5c5e\u5b66\u9662:");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

                //---- confirmEditButton ----
                confirmEditButton.setText("\u786e\u8ba4\u4fee\u6539");
                confirmEditButton.addActionListener(e -> confirmEditButtonActionPerformed(e));

                //---- DeletInfoButton ----
                DeletInfoButton.setText("\u5220\u9664\u4fe1\u606f");
                DeletInfoButton.addActionListener(e -> deleteClassAct(e));

                //---- resetButton ----
                resetButton.setText("\u91cd\u7f6e\u4fe1\u606f");
                resetButton.addActionListener(e -> {
			deleteClassAct(e);
			resetButtonActionPerformed(e);
		});

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(classComboBox1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(searchClassNametextField1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(button1))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 702, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(classNameTextField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(classIDTextField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
                                            .addGap(82, 82, 82)
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(confirmEditButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(classNumberTextField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(25, 25, 25)
                                                    .addComponent(DeletInfoButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))))))
                            .addContainerGap(42, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(classComboBox1)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(searchClassNametextField1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 6, Short.MAX_VALUE))
                                .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(classNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(classNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(classIDTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(confirmEditButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeletInfoButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31))
                );
            }

            GroupLayout classControlFrmContentPaneLayout = new GroupLayout(classControlFrmContentPane);
            classControlFrmContentPane.setLayout(classControlFrmContentPaneLayout);
            classControlFrmContentPaneLayout.setHorizontalGroup(
                classControlFrmContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            classControlFrmContentPaneLayout.setVerticalGroup(
                classControlFrmContentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            classControlFrm.pack();
            classControlFrm.setLocationRelativeTo(classControlFrm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame classControlFrm;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable classListTable;
    private JTextField searchClassNametextField1;
    private JButton button1;
    private JComboBox<String> classComboBox1;
    private JLabel label1;
    private JLabel label2;
    private JTextField classNameTextField;
    private JTextField classIDTextField;
    private JLabel label3;
    private JTextField classNumberTextField;
    private JButton confirmEditButton;
    private JButton DeletInfoButton;
    private JButton resetButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
