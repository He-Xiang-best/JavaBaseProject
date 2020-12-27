/*
 * Created by JFormDesigner on Tue Nov 17 19:17:45 CST 2020
 */

package view.courseView;

import classType.infoType.Course;
import sqlContact.CourseContact;
import util.StringUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
/*
 * @author:何翔
 * @date:2020/11/20 9:45
 * @description:课程管理窗口
 /*
 
 */

public class CourseManageWindow extends JFrame {
    public CourseManageWindow() {
        initComponents();
        setTable(new Course());
    }
    public void showCourseManageWindow(){
        this.setVisible(true);
    }
    private void setTable(Course co){
        /*
         * @author: 何翔
         * @param: [co]
         * @return: void
         * @date: 2020/11/20 9:45
         * @description：获取信息并填充表格
         */
        DefaultTableModel dft = (DefaultTableModel) couseListTable.getModel();
        dft.setRowCount(0);
        CourseContact courseContact = new CourseContact();
        List<Course> courseList = courseContact.getCourseList(co);
        for (Course sc : courseList) {
            Vector v = new Vector();
            v.add(sc.getCourse_id());
            v.add(sc.getCourse_name());
            dft.addRow(v);
        }
        courseContact.CloseCon();
    }

    private void searchCoursebuttonActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:45
         * @description：获取查询方式并查询
         */
        Course course = new Course();
        String str = CourseNametextField.getText().toString();
        if (StringUtil.isEmpty(str)){
            setTable(course);
            return;
        }
        course.setCourse_name(str);
        setTable(course);
    }

    private void editActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:46
         * @description：编辑课程信息
         */
        CourseContact courseContact = new CourseContact();
        int index = couseListTable.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this, "请选中要修改的数据!");
            return;
        }
        DefaultTableModel dft = (DefaultTableModel) couseListTable.getModel();
        String courseName = dft.getValueAt(couseListTable.getSelectedRow(), 1).toString();
        String editCourseName = courseNametextField.getText().toString();
      String courseID = CourseIDtextField.getText().toString();
        if(StringUtil.isEmpty(editCourseName)/*||StringUtil.isEmpty(courseID)*/){
            JOptionPane.showMessageDialog(this, "请填写要修改的内容!");
            return;
        }
        if(courseName.equals(editCourseName)){
            JOptionPane.showMessageDialog(this ,    "您还没有做任何修改!");
            return;
        }
       int id = Integer.parseInt(courseID);
        Course co = new Course();
        co.setCourse_name(editCourseName);
        if(courseContact.update(co,id)){
            JOptionPane.showMessageDialog(this, "更新成功!");
        }else{
            JOptionPane.showMessageDialog(this, "更新失败!");
        }
        courseContact.CloseCon();
        setTable(new Course());
    }

    private void couseListTableMouseClicked(MouseEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:46
         * @description：点击事件填充文本栏
         */
        DefaultTableModel dft = (DefaultTableModel) couseListTable.getModel();
        CourseIDtextField.setText(dft.getValueAt(couseListTable.getSelectedRow(), 0).toString());
//      CourseNametextField.setText(dft.getValueAt(couseListTable.getSelectedRow(), 1).toString());
        courseNametextField.setText(dft.getValueAt(couseListTable.getSelectedRow(), 1).toString());
    }

    private void deleteCourseActionPerformed(ActionEvent e) {
        /*
         * @author: 何翔
         * @param: [e]
         * @return: void
         * @date: 2020/11/20 9:47
         * @description：删除课程信息
         */
        int row = couseListTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "请选中要删除的数据！");
            return;
        }
        int course_id = Integer.parseInt(couseListTable.getValueAt(row, 0).toString());
        CourseContact courseContact = new CourseContact();
        if(courseContact.delete(course_id)){
            JOptionPane.showMessageDialog(this, "删除成功！");
        }else{
            JOptionPane.showMessageDialog(this, "删除失败！");
        }
        courseContact.CloseCon();
        setTable(new Course());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        CourseNametextField = new JTextField();
        searchCoursebutton = new JButton();
        scrollPane1 = new JScrollPane();
        couseListTable = new JTable();
        label2 = new JLabel();
        courseNametextField = new JTextField();
        label3 = new JLabel();
        CourseIDtextField = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        panel1 = new JPanel();

        //======== this ========
        setTitle("\u8bfe\u7a0b\u67e5\u8be2");
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));

        //---- searchCoursebutton ----
        searchCoursebutton.setText("\u67e5\u8be2");
        searchCoursebutton.addActionListener(e -> searchCoursebuttonActionPerformed(e));

        //======== scrollPane1 ========
        {
            //---- couseListTable ----
            couseListTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                },
                new String[] {
                    "\u8bfe\u7a0bID", "\u8bfe\u7a0b\u540d\u79f0"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            couseListTable.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    couseListTableMouseClicked(e);
                }
            });
            scrollPane1.setViewportView(couseListTable);
        }

        //---- label2 ----
        label2.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

        //---- label3 ----
        label3.setText("\u8bfe\u7a0bID\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

        //---- CourseIDtextField ----
        CourseIDtextField.setEditable(false);

        //---- button1 ----
        button1.setText("\u5220\u9664");
        button1.addActionListener(this::deleteCourseActionPerformed);

        //---- button2 ----
        button2.setText("\u4fee\u6539");
        button2.addActionListener(this::editActionPerformed);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING)
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CourseNametextField, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(searchCoursebutton))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CourseIDtextField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(courseNametextField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                            .addGap(43, 43, 43)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button1)
                                .addComponent(button2))))
                    .addContainerGap(132, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(searchCoursebutton)
                        .addComponent(CourseNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(CourseIDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(courseNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1))))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //======== panel1 ========
        {

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 710, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 440, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField CourseNametextField;
    private JButton searchCoursebutton;
    private JScrollPane scrollPane1;
    private JTable couseListTable;
    private JLabel label2;
    private JTextField courseNametextField;
    private JLabel label3;
    private JTextField CourseIDtextField;
    private JButton button1;
    private JButton button2;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
