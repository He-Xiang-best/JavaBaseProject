/*
 * Created by JFormDesigner on Sun Nov 29 15:56:22 CST 2020
 */

package crawler_model.view;

import crawler_model.dao.ItemDao;
import crawler_model.entity.Item;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.Vector;

/**
 * @author 何翔
 */
public class CrawlerWindow extends JFrame {
    public CrawlerWindow() {
        initComponents();
        setTable(new Item());
    }
    public void showCrawlerWindow(){
        this.setVisible(true);
    }
    public void setLogTextArea(String log){
        logTextArea.append(log+"\n");
        logTextArea.paintImmediately(logTextArea.getBounds());
    }
    public void setTable(Item items){
        DefaultTableModel dft = (DefaultTableModel) getItemListTable.getModel();
        dft.setRowCount(0);
        ItemDao itemDao = new ItemDao();
        List<Item> ItemList = itemDao.getItems(items);
        for (Item item : ItemList) {
            Vector v = new Vector();
            v.add(item.getId());
            v.add(item.getName());
            v.add(item.getAuthor_publish());
            v.add(item.getInfo());
            v.add(item.getListPrice());
            v.add(item.getSalePrice());
            v.add(item.getSavePrice());
            v.add(item.getImageURL());
            v.add(item.getBookURL());
            v.add(item.getCreated());
            dft.addRow(v);
        }
        itemDao.CloseConnection();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        getItemListTable = new JTable();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        logTextArea = new JTextArea();
        panel1 = new JPanel();

        //======== this ========
        setTitle("\u722c\u866b\u5c0f\u7a0b\u5e8f");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u722c\u866b\u6570\u636e\u5217\u8868");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));

        //======== scrollPane1 ========
        {

            //---- getItemListTable ----
            getItemListTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "\u5546\u54c1ID", "\u5546\u54c1\u540d\u79f0", "\u5546\u54c1\u8d28\u91cf", "\u5546\u54c1\u7b80\u4ecb", "\u5546\u54c1\u539f\u4ef7", "\u5546\u54c1\u73b0\u552e\u4ef7", "\u5546\u54c1\u8282\u7ea6\u4ef7\u683c", "\u5546\u54c1\u56fe\u7247\u5730\u5740", "\u5546\u54c1\u8be6\u60c5\u5730\u5740", "\u521b\u5efa\u65f6\u95f4"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false, false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            scrollPane1.setViewportView(getItemListTable);
        }

        //---- label2 ----
        label2.setText("\u722c\u866b\u65e5\u5fd7\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 10f));

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(logTextArea);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(476, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                    .addGap(455, 455, 455))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 806, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //======== panel1 ========
        {

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 1070, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 610, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable getItemListTable;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JTextArea logTextArea;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
